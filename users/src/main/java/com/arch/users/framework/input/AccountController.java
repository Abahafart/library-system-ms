package com.arch.users.framework.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arch.users.application.AccountManagement;
import com.arch.users.domain.rest.request.AccountRequest;
import com.arch.users.domain.rest.response.AccountResponse;
import com.arch.users.framework.mappers.AccountMapper;

import reactor.core.publisher.Mono;

@RestController
public class AccountController {

  private static final Logger log = LoggerFactory.getLogger(AccountController.class);
  private final AccountMapper mapper;
  private final AccountManagement accountManagement;

  public AccountController(AccountMapper mapper, AccountManagement accountManagement) {
    this.mapper = mapper;
    this.accountManagement = accountManagement;
  }

  @PostMapping(value = "accounts")
  public Mono<AccountResponse> save(@RequestBody AccountRequest request) {
    Mono<AccountRequest> accountRequest = Mono.just(request);
    accountRequest.log().subscribe(it -> log.info("Request incoming: {}", it));
    return accountRequest.map(mapper::fromRequest).flatMap(it -> accountManagement.save(Mono.just(it))).map(mapper::toResponse);
  }

  @GetMapping(value = "accounts/{id}")
  public Mono<AccountResponse> findById(@PathVariable String id) {
    Mono<String> idMono = Mono.just(id);
    idMono.log().subscribe(it -> log.info("Id incoming: {}", it));
    return accountManagement.findById(idMono).map(mapper::toResponse);
  }

}

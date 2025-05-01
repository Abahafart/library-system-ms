package com.arch.users.framework.input;

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

  private final AccountMapper mapper;
  private final AccountManagement accountManagement;

  public AccountController(AccountMapper mapper, AccountManagement accountManagement) {
    this.mapper = mapper;
    this.accountManagement = accountManagement;
  }

  @PostMapping(value = "accounts")
  public Mono<AccountResponse> save(@RequestBody Mono<AccountRequest> request) {
    return request.map(mapper::fromRequest).flatMap(it -> accountManagement.save(Mono.just(it))).map(mapper::toResponse);
  }

}

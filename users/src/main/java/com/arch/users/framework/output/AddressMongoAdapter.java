package com.arch.users.framework.output;

import java.time.Instant;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import com.arch.users.application.ports.output.AddressPersistence;
import com.arch.users.domain.AddressDO;
import com.arch.users.framework.mappers.AddressMapper;
import com.arch.users.framework.output.repository.AddressRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class AddressMongoAdapter implements AddressPersistence {

  private final AddressRepository addressRepository;
  private final AddressMapper mapper;

  public AddressMongoAdapter(AddressRepository addressRepository, AddressMapper mapper) {
    this.addressRepository = addressRepository;
    this.mapper = mapper;
  }

  @Override
  public Mono<AddressDO> save(Mono<AddressDO> address) {
    return address.map(mapper::toEntity).flatMap(it -> {
      it.setUpdatedAt(Instant.now());
      it.setCreatedAt(Instant.now());
      return addressRepository.save(it);
    }).map(mapper::toModel);
  }

  @Override
  public Mono<AddressDO> findById(Mono<String> id) {
    return id.map(ObjectId::new).flatMap(addressRepository::findById).map(mapper::toModel);
  }

  @Override
  public Mono<Void> deleteById(Mono<String> id) {
    return id.map(ObjectId::new).flatMap(addressRepository::deleteById);
  }

  @Override
  public Flux<AddressDO> findAll() {
    return addressRepository.findAll().map(mapper::toModel);
  }

  @Override
  public Mono<AddressDO> findByAccountId(String accountId) {
    return addressRepository.findByAccountId(accountId).map(mapper::toModel);
  }
}

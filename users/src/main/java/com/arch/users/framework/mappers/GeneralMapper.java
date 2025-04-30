package com.arch.users.framework.mappers;

public interface GeneralMapper<M, E> {

  E toEntity(M model);
  M toModel(E entity);

}

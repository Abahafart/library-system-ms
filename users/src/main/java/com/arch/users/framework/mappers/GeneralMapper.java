package com.arch.users.framework.mappers;

public interface GeneralMapper<M, E, Req, Res> {

  E toEntity(M model);
  M toModel(E entity);
  Res toResponse(M model);
  M fromRequest(Req request);

}

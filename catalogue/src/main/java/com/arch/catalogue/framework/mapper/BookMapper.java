package com.arch.catalogue.framework.mapper;

import com.arch.commons.domain.BookDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.arch.catalogue.domain.rest.request.BookRequest;
import com.arch.catalogue.framework.config.MappingConfig;
import com.arch.catalogue.framework.output.persistence.data.BookData;

@Mapper(config = MappingConfig.class)
public interface BookMapper {

  @Mapping(source = "author", target = "author_id")
  BookData fromModel(BookDO model);
  BookDO toModel(BookData data);
  BookDO fromRequest(BookRequest request);

}

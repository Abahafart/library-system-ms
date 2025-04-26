package com.arch.catalogue.framework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.arch.catalogue.domain.BookDO;
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

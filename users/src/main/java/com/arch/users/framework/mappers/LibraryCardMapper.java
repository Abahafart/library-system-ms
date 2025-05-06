package com.arch.users.framework.mappers;

import com.arch.users.domain.LibraryCardDO;
import com.arch.users.framework.configuration.MappingConfig;
import com.arch.users.framework.output.data.LibraryCardData;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface LibraryCardMapper {

  LibraryCardDO toModel(LibraryCardData libraryCardData);
  LibraryCardData toEntity(LibraryCardDO libraryCardDO);

}

package com.arch.users.framework.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import com.arch.users.domain.AddressDO;
import com.arch.users.domain.rest.request.AddressRequest;
import com.arch.users.domain.rest.response.AddressResponse;
import com.arch.users.framework.configuration.MappingConfig;
import com.arch.users.framework.output.data.AddressData;

@Mapper(config = MappingConfig.class)
public interface AddressMapper extends GeneralMapper<AddressDO, AddressData, AddressRequest, AddressResponse> {
    @Mapping(target = "createdAt", expression = "java(toMexicoCityTimeString(addressDO.getCreatedAt()))")
    @Mapping(target = "updatedAt", expression = "java(toMexicoCityTimeString(addressDO.getUpdatedAt()))")
    AddressResponse toResponse(AddressDO addressDO);

    default String toMexicoCityTimeString(Instant instant) {
        if (instant == null) return null;
        return instant.atZone(ZoneId.of("America/Mexico_City"))
                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}

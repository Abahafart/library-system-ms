package com.arch.users.framework.mappers;

import com.arch.users.domain.AccountDO;
import com.arch.users.domain.rest.request.AccountRequest;
import com.arch.users.domain.rest.response.AccountResponse;
import com.arch.users.framework.configuration.MappingConfig;
import com.arch.users.framework.output.data.AccountData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Mapper(config = MappingConfig.class)
public interface AccountMapper extends GeneralMapper<AccountDO, AccountData, AccountRequest, AccountResponse> {
    @Mapping(target = "createdAt", expression = "java(toMexicoCityTimeString(accountDO.getCreatedAt()))")
    @Mapping(target = "updatedAt", expression = "java(toMexicoCityTimeString(accountDO.getUpdatedAt()))")
    AccountResponse toResponse(AccountDO accountDO);

    default String toMexicoCityTimeString(Instant instant) {
        if (instant == null) return null;
        return instant.atZone(ZoneId.of("America/Mexico_City"))
                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}

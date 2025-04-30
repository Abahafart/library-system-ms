package com.arch.users.framework.mappers;

import com.arch.users.domain.AccountDO;
import com.arch.users.framework.configuration.MappingConfig;
import com.arch.users.framework.output.data.AccountData;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface AccountMapper extends GeneralMapper<AccountDO, AccountData> {

}

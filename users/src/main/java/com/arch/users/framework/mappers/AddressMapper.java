package com.arch.users.framework.mappers;

import org.mapstruct.Mapper;

import com.arch.users.domain.AddressDO;
import com.arch.users.domain.rest.request.AddressRequest;
import com.arch.users.domain.rest.response.AddressResponse;
import com.arch.users.framework.configuration.MappingConfig;
import com.arch.users.framework.output.data.AddressData;

@Mapper(config = MappingConfig.class)
public interface AddressMapper extends GeneralMapper<AddressDO, AddressData, AddressRequest, AddressResponse> {

}

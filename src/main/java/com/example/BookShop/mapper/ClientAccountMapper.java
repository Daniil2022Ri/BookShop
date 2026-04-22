package com.example.BookShop.mapper;

import com.example.BookShop.dto.ClientAccountDto;
import com.example.BookShop.model.ClientAccountData;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientAccountMapper {
    ClientAccountDto toDto(ClientAccountData clientAccountData);

    ClientAccountData toEntity(ClientAccountDto clientAccountDto);

    List<ClientAccountDto> toDtoList(List<ClientAccountData> clientAccountDatas);
}

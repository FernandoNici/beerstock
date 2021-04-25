package com.cold.beer.beerstock.mapper;

import com.cold.beer.beerstock.dto.BeerDTO;
import com.cold.beer.beerstock.model.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}

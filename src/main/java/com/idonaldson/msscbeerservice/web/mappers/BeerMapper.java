package com.idonaldson.msscbeerservice.web.mappers;

import com.idonaldson.msscbeerservice.domain.Beer;
import com.idonaldson.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}

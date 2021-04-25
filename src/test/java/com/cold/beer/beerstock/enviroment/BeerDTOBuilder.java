package com.cold.beer.beerstock.enviroment;

import com.cold.beer.beerstock.dto.BeerDTO;
import com.cold.beer.beerstock.enuns.BeerStyle;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private final String name = "Bohemian Pilsener";

    @Builder.Default
    private final String brand = "Patagonia";

    @Builder.Default
    private final int max = 50;

    @Builder.Default
    private final int quantity = 10;

    @Builder.Default
    private final BeerStyle style = BeerStyle.PILSEN;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                style);
    }
}

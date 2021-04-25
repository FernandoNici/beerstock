package com.cold.beer.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLessThanZeroException extends Exception {

    public BeerStockLessThanZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID has not stock enough: %s units tried to decrement", id, quantityToDecrement));
    }
}
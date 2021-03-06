package com.cold.beer.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String beerAttribute) {
        super(String.format("Beer[%s] not found in the system.", beerAttribute));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Beer with id %s not found in the system.", id));
    }
}
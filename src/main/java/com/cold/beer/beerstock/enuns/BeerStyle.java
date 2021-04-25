package com.cold.beer.beerstock.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerStyle {

    LAGER("Lager"),
    PILSEN("Pilsen"),
    IPA("IPA"),
    NE_IPA("New England IPA"),
    SOUR("Sour"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    APA("APA"),
    MUNICH_HELLES("Munich Helles"),
    STOUT("Stout");

    private final String description;
}

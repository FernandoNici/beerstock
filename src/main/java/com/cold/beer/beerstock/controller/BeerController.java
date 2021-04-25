package com.cold.beer.beerstock.controller;

import com.cold.beer.beerstock.dto.BeerDTO;
import com.cold.beer.beerstock.dto.QuantityDTO;
import com.cold.beer.beerstock.exception.BeerAlreadyRegisteredException;
import com.cold.beer.beerstock.exception.BeerNotFoundException;
import com.cold.beer.beerstock.exception.BeerStockExceededException;
import com.cold.beer.beerstock.exception.BeerStockLessThanZeroException;
import com.cold.beer.beerstock.service.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController implements BeerControllerDocs {

    private final BeerService beerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }

    @GetMapping("/{name}")
    public BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException {
        return beerService.findByName(name);
    }

    @GetMapping
    public List<BeerDTO> listBeers() {
        return beerService.listAll();
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) throws BeerNotFoundException {
        beerService.deleteById(id);
    }

    @PatchMapping("/{id}/increment")
    public BeerDTO increment(@PathVariable Long id, @RequestBody @Valid QuantityDTO quantityDTO) throws BeerNotFoundException, BeerStockExceededException, BeerStockLessThanZeroException {
        return beerService.updateQuantity(id, quantityDTO.getQuantity());
    }
}

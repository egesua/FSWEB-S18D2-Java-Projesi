package com.workintech.SQLD2Challenge.controller;

import com.workintech.SQLD2Challenge.dto.FruitResponse;
import com.workintech.SQLD2Challenge.entity.Fruit;
import com.workintech.SQLD2Challenge.services.FruitService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> get(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Fruit> getDesc(){
        return fruitService.getByPriceDesc();
    }

    /*@GetMapping("/{id}")
    public Fruit getById(@Positive @PathVariable Long id){
        return fruitService.getById(id);
    }*/

    @GetMapping("/{id}")
    public FruitResponse getById(@Positive @PathVariable Long id){
        return new FruitResponse("SUCCEED!", fruitService.getById(id));
    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }
    @GetMapping("/{name}")
    public List<Fruit> getByName(@Size(min = 2, max = 50) @PathVariable String name) {
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable Long id) {
        return fruitService.delete(id);
    }
}

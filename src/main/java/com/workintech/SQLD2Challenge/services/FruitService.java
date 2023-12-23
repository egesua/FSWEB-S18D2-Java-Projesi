package com.workintech.SQLD2Challenge.services;

import com.workintech.SQLD2Challenge.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getByPriceAsc();

    Fruit getById(long id);

    List<Fruit> getByPriceDesc();

    Fruit save(Fruit fruit);

    Fruit delete(long id);

    List<Fruit> searchByName(String name);
}

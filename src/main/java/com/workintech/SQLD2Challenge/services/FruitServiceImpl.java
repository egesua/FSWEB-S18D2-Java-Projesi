package com.workintech.SQLD2Challenge.services;

import com.workintech.SQLD2Challenge.entity.Fruit;
import com.workintech.SQLD2Challenge.exceptions.PlantException;
import com.workintech.SQLD2Challenge.repository.FruitRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public Fruit getById(long id) {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if(optionalFruit.isPresent()){
            return optionalFruit.get();
        }
        throw new PlantException("plant with given id is not exist: " +id, HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }
    @Transactional
    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(long id) {
        Fruit foundedFruit = getById(id);
        fruitRepository.delete(foundedFruit);
        return foundedFruit;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }
}

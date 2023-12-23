package com.workintech.SQLD2Challenge.dto;

import com.workintech.SQLD2Challenge.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}

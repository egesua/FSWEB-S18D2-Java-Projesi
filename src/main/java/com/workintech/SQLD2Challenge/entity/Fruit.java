package com.workintech.SQLD2Challenge.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "fruits", schema = "fsweb")
public class Fruit extends Plant{

    @Enumerated(EnumType.STRING)
    @Column(name = "fruit_type")
    @NotNull
    private FruitType fruitType;

}

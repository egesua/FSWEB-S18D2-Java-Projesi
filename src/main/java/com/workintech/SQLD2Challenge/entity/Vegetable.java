package com.workintech.SQLD2Challenge.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vegetables", schema = "fsweb")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;
}

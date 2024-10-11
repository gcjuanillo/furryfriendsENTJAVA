package com.entjava.furryfriends.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Reptile extends Pet {
    private String species;
    private String diet;
    private String length;
    private boolean poisonous;
}
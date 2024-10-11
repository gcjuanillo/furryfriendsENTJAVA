package com.entjava.furryfriends.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Fish extends Pet {
    private String variant;
    private String size;
    private String coloration;
}
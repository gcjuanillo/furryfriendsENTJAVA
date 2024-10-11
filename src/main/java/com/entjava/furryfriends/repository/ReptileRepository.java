package com.entjava.furryfriends.repository;

import com.entjava.furryfriends.model.Reptile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReptileRepository extends JpaRepository<Reptile, Long> {
    // Add custom query methods specific to Dog
}

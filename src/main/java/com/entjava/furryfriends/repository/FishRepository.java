package com.entjava.furryfriends.repository;

import com.entjava.furryfriends.model.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {
    // Add custom query methods specific to Dog
}

package com.entjava.furryfriends.service;

import com.entjava.furryfriends.model.Fish;
import com.entjava.furryfriends.repository.FishRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class FishService {
    @Autowired
    private FishRepository fishRepository;

    public List<Fish> findAllFish() {
        return fishRepository.findAll();
    }

    public Fish saveFish(Fish fish) {
        return fishRepository.save(fish);
    }

    public void deleteFish(Long id) {
        fishRepository.deleteById(id);
    }
}

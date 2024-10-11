package com.entjava.furryfriends.service;

import com.entjava.furryfriends.model.Reptile;
import com.entjava.furryfriends.repository.ReptileRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ReptileService {
    @Autowired
    private ReptileRepository reptileRepository;

    public List<Reptile> findAllReptiles() {
        return reptileRepository.findAll();
    }

    public Reptile saveReptile(Reptile reptile) {
        return reptileRepository.save(reptile);
    }

    public void deleteReptile(Long id) {
        reptileRepository.deleteById(id);
    }
}
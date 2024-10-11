package com.entjava.furryfriends.controller;

import com.entjava.furryfriends.model.Fish;
import com.entjava.furryfriends.service.FishService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fishes")
public class FishController {

    private final FishService fishService;

    public FishController(FishService fishService) { this.fishService= fishService; }

    @GetMapping
    public List<Fish> getAllFish() { return fishService.findAllFish(); }

    @PostMapping
    public Fish createFish(@RequestBody Fish fish) { return fishService.saveFish(fish);}

    @DeleteMapping("/{id}")
    public void deleteFish(@PathVariable Long id) {fishService.deleteFish(id);}
}
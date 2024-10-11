package com.entjava.furryfriends.controller;

import com.entjava.furryfriends.model.Reptile;
import com.entjava.furryfriends.service.ReptileService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reptiles")
public class ReptileController {

    private final ReptileService reptileService;

    public ReptileController(ReptileService reptileService) { this.reptileService= reptileService; }

    @GetMapping
    public List<Reptile> getAllReptile() { return reptileService.findAllReptiles(); }

    @PostMapping
    public Reptile createReptile(@RequestBody Reptile reptile) { return reptileService.saveReptile(reptile);}

    @DeleteMapping("/{id}")
    public void deleteReptile(@PathVariable Long id) {reptileService.deleteReptile(id);}
}
package org.example.springbootfunko.funko.controllers;

import org.example.springbootfunko.funko.models.Funko;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FunkoController {
    private List<Funko> funkos = new ArrayList<>();

    @GetMapping("/funkos")
    public List<Funko> getFunkos() {
        return funkos;
    }

    @GetMapping("/funkos/{id}")
    public Funko getFunkoById(@PathVariable Long id) {
        return funkos.stream()
                .filter(funko -> funko.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/funkos")
    public Funko addFunko(@RequestBody Funko funko) {
        funko.setId(null);
        funkos.add(funko);
        return funko;
    }

    public FunkoController() {
        funkos.add(new Funko(null, "Batman Funko", 15.99, null, null, null));
        funkos.add(new Funko(null, "Iron Man Funko", 18.50, null, null, null));
    }
}

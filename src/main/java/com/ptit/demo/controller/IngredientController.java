package com.ptit.demo.controller;

import com.ptit.demo.model.Ingredient;
import com.ptit.demo.service.IngredientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping("/list")
    public ResponseEntity<?> getList() {
        List<Ingredient> list = ingredientService.getList();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Ingredient ingredient) {
        Ingredient res = ingredientService.create(ingredient);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@RequestParam Long id) {
        ingredientService.delete(id);
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Ingredient ingredient) {
        Ingredient res = ingredientService.update(ingredient);
        return ResponseEntity.ok(res);
    }

}

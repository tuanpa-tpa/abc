package com.ptit.demo.service.impl;

import com.ptit.demo.model.Ingredient;
import com.ptit.demo.repository.IngredientRepo;
import com.ptit.demo.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepo ingredientRepo;

    @Override
    public List<Ingredient> getList() {
        return ingredientRepo.findAll();
    }

    @Override
    public Ingredient create(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    @Override
    public void delete(Long id) {
        ingredientRepo.deleteById(id);
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }
}

package tacocloud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tacocloud.model.Ingredient;
import tacocloud.repository.IngredientRepository;
import org.springframework.core.convert.converter.Converter;

@Component
@RequiredArgsConstructor
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepo;

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }

}

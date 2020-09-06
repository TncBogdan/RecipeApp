package com.tnc.services;

import com.tnc.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe>getRecipe();
}

package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.services.UnitOfMeasureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class RecipeController {

    private CategoryRepository categoryRepository;
//    private UnitOfMeasureRepository unitOfMeasureRepository;
    private UnitOfMeasureService unitOfMeasureService;

    public RecipeController(CategoryRepository categoryRepository, UnitOfMeasureService unitOfMeasureService) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureService = unitOfMeasureService;
    }

    @RequestMapping({"/recipe"})
    public String getRecipe() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Perfect Guacamole");
        List unitOfMeasureOptional = unitOfMeasureService.getAll();
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findById();

        System.out.println("Recipe for " + categoryOptional.get().getDescription());
//        System.out.println("UOM are: " + unitOfMeasureOptional.get().getDescription());
        System.out.println("UOM is: " + unitOfMeasureOptional.toString());
        return "guacamoleRecipe";
    }
}

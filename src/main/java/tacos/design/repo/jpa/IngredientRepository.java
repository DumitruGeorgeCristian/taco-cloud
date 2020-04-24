package tacos.design.repo.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.design.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

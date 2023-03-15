package seedu.mealcompanion.serde;

import seedu.mealcompanion.MealCompanionException;
import seedu.mealcompanion.ingredient.Ingredient;
import seedu.mealcompanion.ingredient.IngredientList;
import seedu.mealcompanion.recipe.IngredientDatabase;
import seedu.mealcompanion.recipe.Instruction;
import seedu.mealcompanion.recipe.InstructionList;
import seedu.mealcompanion.recipe.Recipe;

import java.util.List;

/**
 * Helper class for JSON deserialization from desired recipe format
 */
public class SerializableRecipe {
    private String name;
    private List<SerializableIngredient> ingredients;
    private List<String> instructions;

    public Recipe toRecipe() throws MealCompanionException {
        IngredientList ingredientList = new IngredientList();
        for(SerializableIngredient ingredient : ingredients) {
            IngredientDatabase db = IngredientDatabase.getDbInstance();
            if (!db.getKnownIngredients().containsKey(ingredient.getName())) {
                throw new MealCompanionException("Unknown ingredient in recipe book: " + ingredient.getName());
            }
            ingredientList.add(new Ingredient(ingredient.getName(), ingredient.getAmount()));
        }

        InstructionList instructionList = new InstructionList();
        for (String instruction : instructions) {
            instructionList.add(new Instruction(instruction));
        }
        return new Recipe(this.name, ingredientList, instructionList);
    }
}
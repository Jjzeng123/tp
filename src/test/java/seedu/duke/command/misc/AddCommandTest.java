package seedu.duke.command.misc;

import org.junit.jupiter.api.Test;
import seedu.duke.DukeSession;
import seedu.duke.ingredient.Ingredient;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.duke.command.misc.AddCommand.isInList;

class AddCommandTest {
    @Test
    public void itemIsInListAndItemNotInList() {
        DukeSession dukeSession = new DukeSession();
        Ingredient ingredient = new Ingredient("apple", 2);
        DukeSession.ingredients.add(ingredient);
        assertTrue(isInList("apple"));
        assertFalse(isInList("orange"));
    }
}
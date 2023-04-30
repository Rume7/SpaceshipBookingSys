package io.turntabl.meal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MealTest {

    @Test
    void testServeMealForHuman() {
        Meal meal = mock(Meal.class);
        String humanMeal = "Human meal served";
        when(meal.serveMeal()).thenReturn(humanMeal);
        assertEquals(meal.serveMeal(), humanMeal);
    }

    @Test
    void testServeMealForMartian() {
        Meal meal = mock(Meal.class);
        String martianMeal = "Martian meal served";
        when(meal.serveMeal()).thenReturn(martianMeal);
        assertEquals(meal.serveMeal(), martianMeal);
    }
}
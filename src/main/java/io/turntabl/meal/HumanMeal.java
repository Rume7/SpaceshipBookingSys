package io.turntabl.meal;

public class HumanMeal implements Meal {

    @Override
    public String serveMeal() {
        return "Human meal";
    }

    @Override
    public String toString() {
        return "Human Meal served";
    }
}

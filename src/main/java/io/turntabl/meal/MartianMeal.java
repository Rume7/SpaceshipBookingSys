package io.turntabl.meal;

public class MartianMeal implements Meal {

    @Override
    public String serveMeal() {
        return "Martian meal";
    }

    @Override
    public String toString() {
        return "Martian Meal served";
    }
}

package io.turntabl.passenger;

import io.turntabl.meal.Meal;

public abstract class Passenger implements Meal {

    private final String ID;
    private final String name;

    public Passenger(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public abstract String getPlutoBelief() ;

    @Override
    public String toString() {
        return "Passenger { ID = " + ID + ", name= " + name + "}";
    }
}

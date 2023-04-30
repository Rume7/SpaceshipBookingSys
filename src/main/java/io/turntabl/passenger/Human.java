package io.turntabl.passenger;

import io.turntabl.belief.Belief;
import io.turntabl.belief.HumanBelief;

public class Human extends Passenger {

    private final Belief belief;

    public Human(String ID, String name) {
        super(ID, name);
        this.belief = new HumanBelief();
    }

    @Override
    public String getPlutoBelief() {
        return belief.plutoBelief();
    }

    @Override
    public String toString() {
        return "Human " + super.toString();
    }

    @Override
    public String serveMeal() {
        return "Human meal served.";
    }
}

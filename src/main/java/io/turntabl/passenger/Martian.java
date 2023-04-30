package io.turntabl.passenger;

import io.turntabl.belief.Belief;
import io.turntabl.belief.MartianBelief;

public class Martian extends Passenger {

    private final Belief belief;

    public Martian(String ID, String name) {
        super(ID, name);
        this.belief = new MartianBelief();
    }

    public String getPlutoBelief() {
        return belief.plutoBelief();
    }

    @Override
    public String toString() {
        return "Martian " + super.toString();
    }
}

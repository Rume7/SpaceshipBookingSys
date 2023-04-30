package io.turntabl.passenger;

public class Human extends Passenger {

    public Human(String ID, String name) {
        super(ID, name);
    }

    @Override
    public String toString() {
        return "Human " + super.toString();
    }
}

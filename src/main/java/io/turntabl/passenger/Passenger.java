package io.turntabl.passenger;

public abstract class Passenger {

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

    @Override
    public String toString() {
        return "Passenger { ID = " + ID + ", name= " + name + "}";
    }
}

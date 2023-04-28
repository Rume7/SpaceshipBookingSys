package io.turntabl.seat;

import io.turntabl.meal.Meal;

import java.util.Objects;

public abstract class Seat {

    private String ID;
    private String name;

    protected Meal meal;

    public Seat(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public abstract SeatType getSeatType();

    public Meal getMeal() {
        return meal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return ID.equals(seat.ID) & name.equals(seat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }

    @Override
    public String toString() {
        return "Seat{ ID = " + ID + ", name = " + name + "}";
    }
}

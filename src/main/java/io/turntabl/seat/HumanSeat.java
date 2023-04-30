package io.turntabl.seat;

import io.turntabl.meal.HumanMeal;

public class HumanSeat extends Seat {

    public HumanSeat(String ID, String name) {
        super(ID, name);
        this.meal = new HumanMeal();
    }

    public SeatType getSeatType() {
        return SeatType.HUMAN;
    }

    @Override
    public String toString() {
        return "Human " + getName() + " Seat";
    }
}

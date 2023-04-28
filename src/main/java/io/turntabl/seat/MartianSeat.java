package io.turntabl.seat;

import io.turntabl.meal.MartianMeal;

public class MartianSeat extends Seat {

    public MartianSeat(String ID, String name) {
        super(ID, name);
        this.meal = new MartianMeal();
    }

    @Override
    public SeatType getSeatType() {
        return SeatType.MARTIANS;
    }

    @Override
    public String toString() {
        return "Martian Seat";
    }
}

package io.turntabl.seat;

public class HumanSeat extends Seat {

    public HumanSeat(String ID, String name) {
        super(ID, name);
    }

    public SeatType getSeatType() {
        return SeatType.HUMAN;
    }

    @Override
    public String toString() {
        return "Human, " + getName() + " Seat";
    }
}

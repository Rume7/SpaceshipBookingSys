package io.turntabl.seat;

public class MartianSeat extends Seat {

    public MartianSeat(String ID, String name) {
        super(ID, name);
    }

    @Override
    public SeatType getSeatType() {
        return SeatType.MARTIANS;
    }

    @Override
    public String toString() {
        return "Martian, " + getName() +" Seat";
    }
}

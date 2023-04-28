package io.turntabl.seat;

public enum SeatType {
    HUMAN("H"), MARTIANS("M");

    private String type;

    SeatType(String type) {
        this.type = type;
    }

    public SeatType getSeatType() {
        if (type.equals("H")) return HUMAN;
        else return MARTIANS;
    }

    @Override
    public String toString() {
        return " { type = " + getSeatType() + " }";
    }
}

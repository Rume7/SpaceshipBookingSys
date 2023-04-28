package io.turntabl.ship;

import io.turntabl.exception.OutOfCapacityException;
import io.turntabl.meal.Meal;
import io.turntabl.seat.HumanSeat;
import io.turntabl.seat.MartianSeat;
import io.turntabl.seat.Seat;
import io.turntabl.seat.SeatType;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {

    private List<Seat> listOfHumanSeats;
    private List<Seat> listOfMartianSeats;
    private static int availableHumanSeats;
    private static int availableMartainSeats;
    private static final int SEAT_CAPACITY = 10;

    /** Assume equal number of human and martain seats. */
    public Spaceship() {
        int capacity = SEAT_CAPACITY/2;
        this.listOfHumanSeats = new ArrayList<>(capacity);
        this.listOfMartianSeats = new ArrayList<>(capacity);
        availableHumanSeats = capacity ;
        availableMartainSeats = capacity ;
        showSeatsAvailable();
    }

    private void showSeatsAvailable() {
        System.out.println("There are " + availableHumanSeats + " human seats available");
        System.out.println("There are " + availableMartainSeats + " martian seats available");
    }

    public String bookSeat(Seat seat) throws OutOfCapacityException {
        Seat bookedSeat = null;

        if (seat.getSeatType() == SeatType.HUMAN) {
            if (availableHumanSeats <= SEAT_CAPACITY/2 && availableHumanSeats > 0) {
                bookedSeat = new HumanSeat(seat.getID(), seat.getName());
                availableHumanSeats--;
            } else {
                throw new OutOfCapacityException("The spaceship is full.");
            }
        } else {
            if (availableMartainSeats <= SEAT_CAPACITY/2 && availableMartainSeats > 0) {
                bookedSeat = new MartianSeat(seat.getID(), seat.getName());
                availableMartainSeats--;
            } else {
                throw new OutOfCapacityException("The spaceship is full.");
            }
        }
        return bookedSeat.toString() + " successfully created";
    }

    public String servePassengerMeal(Seat type) {
        return type.getMeal().toString();
    }

    public void getNumberOfSeatsAvailable() {
        System.out.println("There are " + availableHumanSeats + " human seats available");
        System.out.println("There are " + availableMartainSeats + " martian seats available");
    }
}

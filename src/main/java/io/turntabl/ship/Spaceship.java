package io.turntabl.ship;

import io.turntabl.exception.OutOfCapacityException;
import io.turntabl.passenger.Human;
import io.turntabl.passenger.Martian;
import io.turntabl.passenger.Passenger;
import io.turntabl.seat.HumanSeat;
import io.turntabl.seat.MartianSeat;
import io.turntabl.seat.Seat;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {

    private final List<Seat> listOfHumanSeats;
    private final List<Seat> listOfMartianSeats;
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
        System.out.println("There are " + availableHumanSeats + " human seats and " +
                availableMartainSeats + " martian seats available");
    }

    private Seat bookHumanSeat(Passenger passenger) throws OutOfCapacityException {
        Seat bookedSeat;
        if (availableHumanSeats <= SEAT_CAPACITY/2 && availableHumanSeats > 0) {
            bookedSeat = new HumanSeat(passenger.getID(), passenger.getName());
            listOfHumanSeats.add(bookedSeat);
            availableHumanSeats--;
        }  else {
            throw new OutOfCapacityException("The spaceship is full.");
        }
        return bookedSeat;
    }

    private Seat bookMartianSeat(Passenger passenger) throws OutOfCapacityException {
        Seat bookedSeat;
        if (availableMartainSeats <= SEAT_CAPACITY/2 && availableMartainSeats > 0) {
            bookedSeat = new MartianSeat(passenger.getID(), passenger.getName());
            listOfMartianSeats.add(bookedSeat);
            availableMartainSeats--;
        } else {
            throw new OutOfCapacityException("The spaceship is full.");
        }
        return bookedSeat;
    }

    public Seat bookSeat(Passenger passenger) throws OutOfCapacityException {
        if (passenger instanceof Human) {
            return bookHumanSeat(passenger);
        } else if (passenger instanceof Martian) {
            return bookMartianSeat(passenger);
        }
        return null;
    }

    public String servePassengerMeal(Passenger passenger) {
        return passenger.serveMeal();
    }

    public List<Seat> getListOfHumanSeats() {
        return listOfHumanSeats;
    }

    public List<Seat> getListOfMartianSeats() {
        return listOfMartianSeats;
    }

    public void getNumberOfSeatsAvailable() {
        System.out.println("There are " + availableHumanSeats + " human seats available");
        System.out.println("There are " + availableMartainSeats + " martian seats available");
    }

    @Override
    public String toString() {
        return "Spaceship";
    }
}

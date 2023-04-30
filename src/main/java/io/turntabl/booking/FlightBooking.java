package io.turntabl.booking;

import io.turntabl.exception.OutOfCapacityException;
import io.turntabl.passenger.Passenger;
import io.turntabl.seat.Seat;
import io.turntabl.ship.Spaceship;

public class FlightBooking {

    private Passenger passenger;
    private Seat seat;
    private final Spaceship spaceship;

    public FlightBooking(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public FlightBooking(Passenger passenger, Spaceship spaceship) {
        this.passenger = passenger;
        this.spaceship = spaceship;
    }

    // Create a constructor that allows passenger to choose a seat in the future.

    /** Book a flight in a spaceship for humans. */
    public Seat bookASeat(Passenger passenger) {
        this.passenger = passenger;
        try {
            return this.spaceship.bookSeat(passenger);
        } catch (OutOfCapacityException e) {
            throw new RuntimeException(e);
        }
    }

    /** Display available number of seats for bothhumans and martians. */
    public void getNumberOfAvailableSeats() {
        this.spaceship.getNumberOfSeatsAvailable();
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    @Override
    public String toString() {
        return "FlightBooking { passenger= " + passenger + ", spaceship= " + spaceship + " }";
    }
}

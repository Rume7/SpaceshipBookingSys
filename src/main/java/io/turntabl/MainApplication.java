package io.turntabl;

import io.turntabl.passenger.Human;
import io.turntabl.passenger.Martian;
import io.turntabl.passenger.Passenger;
import io.turntabl.seat.Seat;
import io.turntabl.ship.Spaceship;

public class MainApplication {

    public static void main(String[] args) {

        // Create a spaceship
        Spaceship spaceship = new Spaceship();

        // Create a booking object
        FlightBooking booking = new FlightBooking(spaceship);

        String human_id = "H1001";
        String human_name = "Barry";
        Passenger humanA = new Human(human_id, human_name);

        // Make a human booking
        Seat humanSeat = booking.bookASeat(humanA);
        System.out.println(humanSeat.toString() + " booked.");

        // Create a Martian passenger
        String martian_id = "M1001";
        String martian_name = "Galloway";
        Passenger martianA = new Martian(martian_id, martian_name);

        // Make a martian booking
        Seat martianSeat = booking.bookASeat(martianA);
        System.out.println(martianSeat.toString() + " booked.");

        booking.getSpaceship().getNumberOfSeatsAvailable();

        //booking.getSpaceship().servePassengerMeal(meal);
    }
}

package io.turntabl;

import io.turntabl.exception.OutOfCapacityException;
import io.turntabl.seat.HumanSeat;
import io.turntabl.seat.MartianSeat;
import io.turntabl.seat.Seat;

public class MainApplication {

    public static void main(String[] args) {

        // Create a spaceship
        Spaceship spaceship = new Spaceship();

        // Book a human seat
        String id = "1001";
        String name = "Barry";
        Seat seat1 = new HumanSeat(id, name);

        // Book a human seat
        try {
            String done = spaceship.bookSeat(seat1);
            System.out.println(done);

            String served = spaceship.servePassengerMeal(seat1);
            System.out.println(served + "\n");
        }catch (OutOfCapacityException oce) {
            System.out.println(oce.getMessage());
            return;
        }

        spaceship.getNumberOfSeatsAvailable();

        // Book a human seat
        String martian_id = "1001";
        String martian_name = "Barry";
        Seat seat2 = new MartianSeat(martian_id, martian_name);

        // Book a Martian seat
        try {
            String done = spaceship.bookSeat(seat2);
            System.out.println(done);

            String served = spaceship.servePassengerMeal(seat2);
            System.out.println(served + "\n");
        }catch (OutOfCapacityException oce) {
            System.out.println(oce.getMessage());
            return;
        }
        spaceship.getNumberOfSeatsAvailable();
    }
}

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;
    Passenger passenger57;
    Plane plane;


    @Before

    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "Sauzee", "BA007", "Leith", "Aberdeen", "0830" );
        passenger = new Passenger("lewis", 1);
        passenger2 = new Passenger("lewis", 1);
        passenger3 = new Passenger("lewis", 1);
        passenger4 = new Passenger("lewis", 1);
        passenger5 = new Passenger("lewis", 1);
        passenger6 = new Passenger("lewis", 1);
        passenger7 = new Passenger("lewis", 1);
        passenger8 = new Passenger("lewis", 1);
        passenger9 = new Passenger("lewis", 1);
        passenger10 = new Passenger("lewis", 1);
        passenger57 = new Passenger("Wesley Snipes", 1);

    }

    @Test

    public void getPlaneName(){
        assertEquals("Sauzee", flight.getPlaneName());
    }

    @Test

    public void checkAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.checkPassengers());

    }

    @Test

    public void checkCanAddPassengerIfRoom(){
        flight.addPassenger(passenger);
        assertTrue(flight.checkForSeat());
    }

    @Test

    public void checkCantAddPassenger(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger57);
        assertFalse(flight.checkForSeat());
    }

}



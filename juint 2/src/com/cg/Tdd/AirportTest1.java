
package com.cg.Tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
class AirportTest1 {
@DisplayName("Given there is a business flight")
@Nested
class BusinessFlightTest {
private Flight businessFlight;
@BeforeEach
void setUp() {
businessFlight = new Flight("2", "Business");
}
@Test
public void testBusinessFlightRegularPassenger() {
Passenger mike = new Passenger("Mike", false);
assertEquals(false, businessFlight.addPassenger(mike));
assertEquals(0, businessFlight.getPassengersList().size());
assertEquals(false, businessFlight.removePassenger(mike));
assertEquals(0, businessFlight.getPassengersList().size());
}
@Test
public void testBusinessFlightVipPassenger() {
Passenger james = new Passenger("James", true);
assertEquals(true, businessFlight.addPassenger(james));
assertEquals(1, businessFlight.getPassengersList().size());
assertEquals(false, businessFlight.removePassenger(james));
assertEquals(1, businessFlight.getPassengersList().size());
}
}

public void assertEquals(boolean b, boolean addPassenger) {
	// TODO Auto-generated method stub
	
}

public void assertEquals(int i, int size) {
	// TODO Auto-generated method stub
	
}
}





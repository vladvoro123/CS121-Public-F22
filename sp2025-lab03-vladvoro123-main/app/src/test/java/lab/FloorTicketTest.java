package lab;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Tests functionality of FloorTicket
 * 
 * @author krodgers
 * @author
 */
public class FloorTicketTest {
    private final double BASE_COST = 16;
    // Test constructor
    // by way of testing the getters
    @Test
    public void testFloorTicketConstructor() {
        String name = "Alice";
        TicketInterface.Event type = TicketInterface.Event.CONCERT;
        String date = "12/10/2024";
        double expectedCost = BASE_COST;
        int zone = 1;

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        assertEquals(ticket.getName(), name);
        assertEquals(ticket.getEvent(), type);
        assertEquals(ticket.getDate(), date);
        assertEquals(ticket.getLocation(), zone);
    }

    // Test costs are correct 
    @Test
    public void testZoneOneAndFour() {
        int zone1 = 1;
        int zone4 = 4;
        double expectedCost = BASE_COST;

        FloorTicket ticket1 = new FloorTicket("Bob", TicketInterface.Event.SPORT, "11/05/2024", 1);
        FloorTicket ticket2 = new FloorTicket("Charlie", TicketInterface.Event.PERFORMANCE, "10/20/2024", 4);

        assertEquals(ticket1.getCost(), expectedCost, 0.01);
        assertEquals(ticket2.getCost(), expectedCost, 0.01);
    }

    @Test
    public void testZoneTwoAndThree() {
        int zone2 = 2;
        int zone3 = 3;
        double expectedCost = BASE_COST * 2;

        FloorTicket ticket1 = new FloorTicket("Dana", TicketInterface.Event.CONCERT, "09/15/2024", 2);
        FloorTicket ticket2 = new FloorTicket("Eve", TicketInterface.Event.SPORT, "08/12/2024", 3);
        assertEquals(ticket1.getCost(), expectedCost, 0.01);
        assertEquals(ticket2.getCost(), expectedCost, 0.01);
    }
    

    // Test toString
    @Test
    public void testFloorTicketToString() {
        String name = "Frank";
        TicketInterface.Event type = TicketInterface.Event.PERFORMANCE;
        String date = "07/04/2024";
        int zone = 3;
        double expectedCost = BASE_COST * 2;

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        assertEquals(ticket.toString(), "Ticket Zone[3] ($32.00)");
    }

    // Test promo codes

    // verify promo code can be added
    @Test 
    public void testApplyPromoCode() {
        String name = "Grace";
        TicketInterface.Event type = TicketInterface.Event.SPORT;
        String date = "06/01/2024";
        int zone = 1;
        double discount = 0.20;
        double expectedCost = BASE_COST * (1 - discount);

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        double discountedPrice = ticket.applyPromo(discount);
        assertEquals(discountedPrice, expectedCost, 0.01);
    }

    // verify promo code is NOT added if a promo code has already been
    // applied
    @Test
    public void testApplyPromoCodeAlreadyApplied() {
        String name = "Hank";
        TicketInterface.Event type = TicketInterface.Event.CONCERT;
        String date = "05/10/2024";
        int zone = 4;
        double firstDiscount = 0.10;
        double secondDiscount = 0.20;
        double expectedCost = BASE_COST * (1 - firstDiscount);

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        ticket.applyPromo(firstDiscount);
        double discountedPrice = ticket.applyPromo(secondDiscount);
        
        assertEquals(discountedPrice, expectedCost, 0.01);
    }

    // verify you can remove a promo code after adding it
    @Test
    public void testRemovePromoCode() {
        String name = "Ivy";
        TicketInterface.Event type = TicketInterface.Event.PERFORMANCE;
        String date = "04/15/2024";
        int zone = 2;
        double discount = 0.15;
        double originalCost = BASE_COST * 2;

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        ticket.applyPromo(discount);
        boolean removed = ticket.removePromo(discount);

        assertTrue(removed);
        assertEquals(ticket.getCost(), originalCost, 0.01);
    }

    // verify nothing changes if try to remove a promo code before one
    // was actually added
    @Test
    public void testRemovePromoCodeNoPromoApplied() {
        String name = "Jack";
        TicketInterface.Event type = TicketInterface.Event.SPORT;
        String date = "03/20/2024";
        int zone = 3;
        double discount = 0.10;
        double originalCost = BASE_COST * 2;

        FloorTicket ticket = new FloorTicket(name, type, date, zone);
        boolean removed = ticket.removePromo(discount);

        assertFalse(removed);
        assertEquals(ticket.getCost(), originalCost, 0.01);
    }

}

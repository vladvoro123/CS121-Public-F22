package lab;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Tests VIPTicket class
 * 
 * @author
 */

public class VIPTicketTest {
    private final double BASE_COST = 16;

    // TODO: Test all overridden methods
    @Test
    public void testVIPTicketConstructor() {
        VIPTicket ticket = new VIPTicket("Alice", TicketInterface.Event.CONCERT, "12/10/2024", 'S');
        assertEquals(ticket.getName(), "Alice");
        assertEquals(ticket.getEvent(), TicketInterface.Event.CONCERT);
        assertEquals(ticket.getDate(), "12/10/2024");
        assertEquals(ticket.getLocation(), 'S');
        assertEquals(ticket.getCost(), BASE_COST * 5, 0.01);
    }
    
    @Test
    public void testVIPTicketToString() {
        VIPTicket ticket = new VIPTicket("Bob", TicketInterface.Event.SPORT, "11/05/2024", 'E');
        assertEquals(ticket.toString(), "VIPTicket [Box E] ($48.00)");
    }

    // TODO: Test cost is correct for all valid locations
    @Test
    public void testApplyPromoCode() {
        VIPTicket ticket = new VIPTicket("Charlie", TicketInterface.Event.PERFORMANCE, "10/20/2024", 'W');
        double discountedPrice = ticket.applyPromo(0.20);
        assertEquals(discountedPrice, BASE_COST * 3 * 0.8, 0.01);
    }
    
    @Test
    public void testApplyPromoCodeAlreadyApplied() {
        VIPTicket ticket = new VIPTicket("Dana", TicketInterface.Event.CONCERT, "09/15/2024", 'S');
        ticket.applyPromo(0.10);
        double discountedPrice = ticket.applyPromo(0.20);
        assertEquals(discountedPrice, BASE_COST * 5 * 0.9, 0.01);
    }
    
    @Test
    public void testRemovePromoCode() {
        VIPTicket ticket = new VIPTicket("Eve", TicketInterface.Event.SPORT, "08/12/2024", 'W');
        ticket.applyPromo(0.15);
        assertTrue(ticket.removePromo(0.15));
        assertEquals(ticket.getCost(), BASE_COST * 3, 0.01);
    }
    
    @Test
    public void testRemovePromoCodeNoPromoApplied() {
        VIPTicket ticket = new VIPTicket("Frank", TicketInterface.Event.PERFORMANCE, "07/04/2024", 'E');
        assertFalse(ticket.removePromo(0.10));
        assertEquals(ticket.getCost(), BASE_COST * 3, 0.01);
    }
    
}

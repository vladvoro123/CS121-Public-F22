package lab;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Tests StageTicket class
 * 
 * @author
 */

public class StageTicketTest {
    private final double BASE_COST = 16;
    private final double STAGE_MULTIPLIER = 100;
    // TODO: Test all overridden methods
    @Test
    public void testStageTicketConstructor() {
        String name = "Alice";
        TicketInterface.Event type = TicketInterface.Event.CONCERT;
        String date = "12/10/2024";
        int wing = 100;
        double expectedCost = BASE_COST * STAGE_MULTIPLIER;

        StageTicket ticket = new StageTicket(name, type, date, wing);
        assertEquals(ticket.getName(), name);
        assertEquals(ticket.getEvent(), type);
        assertEquals(ticket.getDate(), date);
        assertEquals(ticket.getLocation(), wing);
        assertEquals(ticket.getCost(), expectedCost, 0.01);
    }
    
    @Test
    public void testStageTicketToString() {
        String name = "Bob";
        TicketInterface.Event type = TicketInterface.Event.SPORT;
        String date = "11/05/2024";
        int wing = 200;

        StageTicket ticket = new StageTicket(name, type, date, wing);
        assertEquals(ticket.toString(), String.format("StageTicket [Wing %d]", wing));
    }

    // TODO: Test cost is correct for all valid locations
    @Test
    public void testApplyPromoCode() {
        String name = "Charlie";
        TicketInterface.Event type = TicketInterface.Event.PERFORMANCE;
        String date = "10/20/2024";
        int wing = 100;
        double discount = 0.20;
        double expectedCost = (BASE_COST * STAGE_MULTIPLIER) * (1 - discount);
        
        StageTicket ticket = new StageTicket(name, type, date, wing);
        assertEquals(ticket.applyPromo(discount), expectedCost, 0.01);
    }
    
    @Test
    public void testApplyPromoCodeAlreadyApplied() {
        int wing = 200;
        double firstDiscount = 0.10, secondDiscount = 0.20;
        double expectedCost = (BASE_COST * STAGE_MULTIPLIER) * (1 - firstDiscount);

        StageTicket ticket = new StageTicket("Dana", TicketInterface.Event.CONCERT, "09/15/2024", wing);
        ticket.applyPromo(firstDiscount);
        assertEquals(ticket.applyPromo(secondDiscount), expectedCost, 0.01);
    }
    
    @Test
    public void testRemovePromoCode() {
        int wing = 100;
        double discount = 0.15;
        double expectedCost = BASE_COST * STAGE_MULTIPLIER;

        StageTicket ticket = new StageTicket("Eve", TicketInterface.Event.SPORT, "08/12/2024", wing);
        ticket.applyPromo(discount);
        assertTrue(ticket.removePromo(discount));
        assertEquals(ticket.getCost(), expectedCost, 0.01);
    }
    
    @Test
    public void testRemovePromoCodeNoPromoApplied() {
        int wing = 200;
        double expectedCost = BASE_COST * STAGE_MULTIPLIER;

        StageTicket ticket = new StageTicket("Frank", TicketInterface.Event.PERFORMANCE, "07/04/2024", wing);
        assertFalse(ticket.removePromo(0.10));
        assertEquals(ticket.getCost(), expectedCost, 0.01);
    }
}

package lab;

/**
 * This class represents a ticket for a specific zone in the
 * arena. Valid zones are zones 1, 2, 3, and 4. Tickets in zones 1
 * and 4 cost BASE_COST. Tickets in zones 2 and 3 cost double the
 * BASE_COST.
 *
 * @author
 */

public class FloorTicket extends BasicTicket {
    // TODO: Needs one more private instace variable - int zone
    private int zone;
    // Use protected variable cost

    // TODO: FloorTicket constructor
    // Remember to call super(...) to
    // initialize instance variables from BasicTicket
    public FloorTicket(String name, TicketInterface.Event event, String date, int zone) {
        super(name, event, date);
        this.zone = zone;
        if (zone == 2 || zone == 3) {
            cost *= 2;
        }
    }

    // TODO: Override getLocation to return the zone of the ticket
    @Override
    public int getLocation() {
        return zone;
    }
    // TODO: Override toString to return "Ticket Zone[X] ($00.00)"
    // Example: "Ticket Zone[1] ($16.00)
    @Override
    public String toString() {
        return String.format("Ticket Zone[%d] ($%.2f)", zone, cost);
    }
}

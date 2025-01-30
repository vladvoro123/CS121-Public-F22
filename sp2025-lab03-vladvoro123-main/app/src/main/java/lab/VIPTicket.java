package lab;

/**
 * Represents a ticket for a box seat in the arena. Valid boxes are
 * boxes E, S, W. Box E and W cost 3 times the base ticket cost while
 * box S costs 5 times the base ticket cost.
 * 
 * @author
 */
public class VIPTicket extends BasicTicket {
    // TODO: VIPTicket needs private char box
    private char box;

    // TODO: Constructor
    // Don't forget to call super( ...) to initialize instance variables
    // stored in BasicTicket
    public VIPTicket(String name, TicketInterface.Event event, String date, char box) {
        super(name, event, date);
        this.box = box;
        if (box == 'E' || box == 'W') {
            cost *= 3; 
        } else if (box == 'S') {
            cost *= 5; 
        }
    }

    // TODO: Override getLocation to return the box letter
    @Override
    public int getLocation() {
        return box; 
    }
    // TODO: Override toString to return "VIPTicket [Box X] ($00.00)"
    // Example: "VIPTicket [Box S] ($80.00)"
    @Override
    public String toString() {
        return String.format("VIPTicket [Box %c] ($%.2f)", box, cost);
    }
}

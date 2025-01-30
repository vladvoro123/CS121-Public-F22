package lab;

/**
 * Represents a ticket for a seat on stage, in the wing. Seats are
 * available in wing 100 and wing 200. Tickets cost 100 times the
 * BASE_PRICE regardless of the wing.
 * 
 * @author
 */
public class StageTicket extends VIPTicket {
    private int wing;
    private static final double BASE_COST = 16;
    // StageTicket does not need any additional instance variables.
    // Use box to store the wing number

    // TODO: Constructor
    // Don't forget to call super( ...) to initialize instance variables
    // stored in VIPTicket
    public StageTicket(String name, TicketInterface.Event event, String date, int wing) {
        super(name, event, date, (char) wing);
        this.wing = wing;
        this.cost = 100 * BASE_COST;
    }
    // TODO: Override toString to return "StageTicket [Wing XXX]"
    // Example: "StageTicket [Wing 200]"
    @Override
    public String toString() {
        return String.format("StageTicket [Wing %d]", wing);
    }
}

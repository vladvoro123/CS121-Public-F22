package lab;

/**
 * Represents a generic ticket for an event
 * DO NOT MODIFY THIS FILE
 * 
 * @author krodgers
 */

public abstract class BasicTicket implements TicketInterface {
    private String name;
    private TicketInterface.Event event;
    private String date;

    protected double cost;

    // true if this ticket has a promotion applied
    // only one promotion can be applied
    private boolean hasPromo;

    // Starting price for all tickets
    private final double BASE_PRICE = 16;

    /**
     * Constructor for BasicTicket for child classes to call
     * 
     * @param name:  name of person who bought this ticket
     * @param event: kind of event ticket is for
     * @param date:  date of event, in format mm/dd/yyyy
     */
    public BasicTicket(String name, TicketInterface.Event event, String date) {
        this.name = name;
        this.event = event;
        this.date = date;
        cost = BASE_PRICE;

        // instantiate validPromos
        hasPromo = false;
    }

    @Override
    public abstract int getLocation();

    @Override
    public Event getEvent() {
        return event;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double applyPromo(double discount) {
        if (!hasPromo && discount > 0) {
            cost -= cost * discount;
            hasPromo = true;
        }
        return cost;
    }

    @Override
    public boolean removePromo(double discount) {
        if (!hasPromo) {
            return false;
        }

        // undo the discount
        hasPromo = false;
        cost = cost / (1 - discount);
        return true;
    }

}

package lab;

/**
 * Represents an event ticket
 * DO NOT MODIFY THIS FILE
 * 
 * @author krodgers
 */

public interface TicketInterface {
    public enum Event {
        SPORT, CONCERT, PERFORMANCE
    };

    /**
     * Returns the type of event for which this
     * ticket was issued
     */
    public Event getEvent();

    /**
     * Returns the date of the event for
     * which this ticket grants access in the
     * format mm/dd/yyyy
     */
    public String getDate();

    /**
     * Returns the ticket holder's name
     */
    public String getName();

    /**
     * Returns the specific spot where the ticket
     * holder will sit
     */
    public int getLocation();

    /**
     * Returns the price of the ticket
     */
    public double getCost();

    /**
     * Applies the discount to the ticket cost
     * 
     * @param discount how much to discount as a percentage (0.20 is 20% off)
     * @return the discounted cost of the ticket
     */
    public double applyPromo(double discount);

    /**
     * Removes a promotion from this ticket
     * The discount amount is added back to the ticket to bring
     * it back to full cost
     * 
     * @param discount the discount amount the promo was worth as a percentage (0.20
     *                 was 20% off)
     * @return true if the promo was present and successfully removed;
     *         false otherwise
     */
    public boolean removePromo(double discount);

}

/*
 * Tests AutomaticFeeder class
 *
 * Behavior is expected to match JavaDocs from AutomaticFeeder class
 *
 * @author krodgers
 * @author YOUR-NAME-GOES-HERE
 *
 */

package lab;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AutomaticFeederTest {
    // Each method needs to marked as a test method with @Test
    //
    // Most test are set up as:
    // 1. Create object to use as test object
    // 2. Call method
    // 3. Check method's return value and side effects (if they exist and possible
    // to test)

    //////////////////////
    // Test Constructor //
    //////////////////////

    // Test AutomaticFeeder can be constructed
    // Also tests toString on empty object
    @Test
    public void testConstructor() {
        AutomaticFeeder testObj = new AutomaticFeeder();
        String border = "-".repeat(15);
        String expected = String.format("%-6s -- %s\n%s\n", "Time", "Amount", border);
        assertEquals(testObj.toString(), expected);
    }

    //////////////////////////////////
    // Test addFeeding and toString //
    //////////////////////////////////

    // Test object with 1 feeding
    // Tests both toString and addFeeding
    // addFeeding can't be directly tested, so toString is one way to check
    @Test
    public void testAddOneFeeding() {
        AutomaticFeeder feeder = new AutomaticFeeder();
        feeder.addFeeding(9, 15, 0.5);
        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n%-6s -- %.2f\n", "Time", "Amount", border, "09:15", 0.5);
        assertEquals(feeder.toString(), expectedString);
    }

    // TODO
    // Test object with 2 feedings
    // Tests both toString and addFeeding
    @Test
    public void testAddTwoFeedings() {

       
        AutomaticFeeder feeder = new AutomaticFeeder();

        // TODO: call addFeeding
        // Add a feeding at 9:15 with amount = 0.5
        // Add a feeding at 18:37 with amount = 6

        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n%-6s -- %.2f\n%-6s -- %.2f\n", "Time", "Amount", border,
                "09:15", 0.5, "18:37", 6.0);

        // Assert toString result is equal to expectedString

    }

    // Test object with 3 feedings
    // Tests both toString and addFeeding
    @Test
    public void testAddThreeFeedings() {
        AutomaticFeeder feeder = new AutomaticFeeder();
        feeder.addFeeding(9, 15, 0.5);
        feeder.addFeeding(18, 37, 6);
        feeder.addFeeding(12, 6, 2.45);

        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n%-6s -- %.2f\n%-6s -- %.2f\n%-6s -- %.2f\n", "Time",
                "Amount", border, "09:15", 0.5, "12:06", 2.45, "18:37", 6.0);
        assertEquals(feeder.toString(), expectedString);
    }


    // Test invalid data for addFeeding
    // Tests both toString and addFeeding
    @Test
    public void testAddInvalidFeedings() {
        AutomaticFeeder feeder = new AutomaticFeeder();

        // expected empty feeder
        String border = "-".repeat(15);
        String expected = String.format("%-6s -- %s\n%s\n", "Time", "Amount", border);

        // try invalid hour
        feeder.addFeeding(30, 15, 0.5);
        assertEquals(feeder.toString(), expected);

        // try invalid minute
        feeder.addFeeding(18, -12, 6);
        assertEquals(feeder.toString(), expected);

        // try invalid amount
        feeder.addFeeding(12, 6, -3);
        assertEquals(feeder.toString(), expected);
    }

    /////////////////////////////////
    // Test getAmount and toString //
    /////////////////////////////////

    // Test getAmount and toString
    // find existing time in index 0
    @Test
    public void testGetAmountExistingItemIndexZero() {
        AutomaticFeeder feeder = new AutomaticFeeder();
        int hour = 13;
        int min = 45;
        double expectedAmount = 3.5;
        feeder.addFeeding(hour, min, expectedAmount);

        // verify return value
        assertEquals(feeder.getAmount(hour, min), expectedAmount);

        // check toString to make sure feeding was added
        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n%-6s -- %.2f\n", "Time", "Amount", border, "13:45",
                expectedAmount);
        assertEquals(feeder.toString(), expectedString);
    }

    // TODO
    // Test getAmount
    // find non-existing time with one time element
    @Test
    public void testGetAmountMissingItemOneElement() {
        // TODO: Fill in this method

        assertTrue(false); // delete this line! This makes sure you can find this test to implement.

        // Create a feeder object

        // Add ONE feeding

        // call getAmount with non-existing time (e.g. a time different than the feeding
        // you added)
        // verify the amount returned is correct (what should be returned when the time
        // is incorrect?)
        // (like verify return value in the previous test)

    }

    /**
     * Generates an expected String
     * 
     * @param hrs
     * @param mins
     * @param amts
     * @return expected result of toString
     */
    private static String createString(int[] hrs, int[] mins, double[] amts) {
        String title = String.format("%-6s -- %s\n", "Time", "Amount");
        String border = "-".repeat(15) + "\n";
        String rowFmt = "%02d:%02d  -- %.2f\n";

        String res = title + border;

        for (int i = 0; i < hrs.length; i++) {
            res += String.format(rowFmt, hrs[i], mins[i], amts[i]);
        }

        return res;
    }

    /*
     * The tests below use this DataProvider. You don't need to know how to use
     * these quite yet, but it
     * is a good example.
     * 
     * DataProviders are a way to generate test data and pass the data as parameters
     * to the test
     * methods so that you can reuse test methods.
     * 
     */

    @DataProvider(name = "twoElemLists")
    public static Object[][] twoElements() {
        // Existing item first and last elements
        // Non-existing item
        int[] hrs = { 12, 13 };
        int[] mins = { 0, 1};
        double[] amts = { 2.75, 2.75 };

        AutomaticFeeder[] objs = { new AutomaticFeeder(), new AutomaticFeeder(), new AutomaticFeeder() };
        for (int i = 0; i < objs.length; i++) {
            for (int j = 0; j < 2; j++) {
                objs[i].addFeeding(hrs[j], mins[j], amts[j]);
            }
        }
        String expectedToString = createString(hrs, mins, amts);
        // get first, last, missing
        return new Object[][] { { objs[0], hrs[0], mins[0], amts[0], expectedToString },
                { objs[1], hrs[1], mins[1], amts[1], expectedToString },
                { objs[2], 9, 13, -1, expectedToString }
        };

    }

    @DataProvider(name = "threeElemLists")
    public static Object[][] threeElements() {
        // Existing items first, middle, last elements
        // Non-existing item

        int[] hrs = { 5, 19, 3 };
        int[] mins = { 15, 30, 59 };
        double[] amts = { 8.0, 8.1, 8.05 };

        AutomaticFeeder[] objs = { new AutomaticFeeder(), new AutomaticFeeder(),
                new AutomaticFeeder(), new AutomaticFeeder() };

        for (int i = 0; i < objs.length; i++) {
            for (int j = 0; j < hrs.length; j++) {
                objs[i].addFeeding(hrs[j], mins[j], amts[j]);
            }
        }
        // get first, middle, last, missing

        String expectedToString = createString(new int[] { 3, 5, 19 }, new int[] { 59, 15, 30 },
                new double[] { 8.05, 8.0, 8.1 });

        return new Object[][] { { objs[0], hrs[0], mins[0], amts[0], expectedToString },
                { objs[1], hrs[1], mins[1], amts[1], expectedToString },
                { objs[2], hrs[2], mins[2], amts[2], expectedToString },
                { objs[3], 23, 59, -1, expectedToString }
        };

    }

    // Get amount - 2 elements
    @Test(dataProvider = "twoElemLists")
    public void testGetAmountTwoElems(AutomaticFeeder obj, int hour, int min, double expectedAmt,
            String expectedToString) {
        assertEquals(obj.getAmount(hour, min), expectedAmt);
        assertEquals(obj.toString(), expectedToString);
    }

    // Get amount - 3 elements
    @Test(dataProvider = "threeElemLists")
    public void testGetAmountThreeElems(AutomaticFeeder obj, int hour, int min, double expectedAmt,
            String expectedToString) {
        assertEquals(obj.getAmount(hour, min), expectedAmt);
        assertEquals(obj.toString(), expectedToString);
    }

    /////////////////////////////////////
    // Test removeFeeding and toString //
    /////////////////////////////////////

    // Test removeFeeding
    // remove existing item at index 0
    @Test
    public void testRemoveFeedingExistingItemIndexZero() {
        AutomaticFeeder feeder = new AutomaticFeeder();
        int hour = 13;
        int min = 45;
        double expectedAmount = 3.5;
        feeder.addFeeding(hour, min, expectedAmount);

        // Check return value
        assertTrue(feeder.removeFeeding(hour, min));

        // check side effect
        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n", "Time", "Amount", border);
        assertEquals(feeder.toString(), expectedString);
    }

    // TODO
    // Test removeFeeding
    // remove non-existing item with one elem
    @Test
    public void testRemoveFeedingMissingOneElem() {
        assertTrue(false); // delete this line! This makes sure you can find this test to implement.

        // TODO: implement this method

        // Create Automatic feeder object
        // Add one feeding
        double expectedAmount = -1; // update this line with your chosen amount

        // Call remove feeding with an invalid time
        // verify the return value of removeFeeding is correct
        // (you can use assertFalse rather than assertEquals)

        // Verify the existing feeding was NOT removed
        // Use toString to verify the feeding is still there

        // Create expected String
        String border = "-".repeat(15);
        String expectedString = String.format("%-6s -- %s\n%s\n%-6s -- %.2f\n", "Time", "Amount", border, "13:45",
                expectedAmount);

        // call assertEquals to verify the return value of toString matches the
        // expectedString

    }

    // Test removeFeeding
    // 2 element list - remove first and last
    // 2 elements - remove non-existant
    @Test(dataProvider = "twoElemLists")
    public void testRemoveFeedingTwoElems(AutomaticFeeder obj, int hour, int min, double expectedAmt,
            String expectedToString) {
        // remove elements from expectedToString
        String regex = String.format("%02d:%02d  -- %.2f\n", hour, min, expectedAmt);
        expectedToString.replace(regex, "");

        assertEquals(obj.getAmount(hour, min), expectedAmt);
        assertEquals(obj.toString(), expectedToString);
    }

    // Test removeFeeding
    // 3 element list - remove first, mid, last
    // 3 elements - remove non-existant
    @Test(dataProvider = "threeElemLists")
    public void testRemoveFeedingThreeElems(AutomaticFeeder obj, int hour, int min, double expectedAmt,
            String expectedToString) {
        // remove elements from expectedToString
        String regex = String.format("%02d:%02d  -- %.2f\n", hour, min, expectedAmt);
        expectedToString.replace(regex, "");

        assertEquals(obj.getAmount(hour, min), expectedAmt);
        assertEquals(obj.toString(), expectedToString);
    }

}

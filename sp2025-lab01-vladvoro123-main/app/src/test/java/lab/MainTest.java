/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class MainTest {

    // Tests that getGreeting returns the proper value
    @Test
    public void testGetGreeting() {
        Main testObject = new Main();
        String expectedValue = "Hello";

        // Checks that the return value of getGreeting is equal
        // to the value of expectedValue
        // assertEquals (actual, expected)
        assertEquals(testObject.getGreeting(), expectedValue);
    }

    // Tests that getPlanet returns the proper value
    // Implement a new method called testGetPlanet here
}

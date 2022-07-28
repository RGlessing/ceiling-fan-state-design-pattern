package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for testing the speed state functionality.
 *
 * @author Ryan Glessing
 */

public class DirectionStateTest {
    /**
     * This test will ensure that the Ceiling fan changes from the clockwise state to the counterclockwise state,
     * when a CeilingFanContext instance calls the pullDirectionChain method.
     */
    @Test
    public void testChangeSettingClockwiseToCounterclockwise(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof CounterclockwiseState);
    }
    /**
     * This test will ensure that the Ceiling fan changes from the counterclockwise state to the clockwise state,
     * when a CeilingFanContext instance calls the pullDirectionChain method.
     */
    @Test
    public void testChangeSettingCounterclockwiseToClockwise(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }
    /**
     * This test will ensure that the fan's speed is unaffected by a change in its direction when the direction chain
     * is pulled. A new fan is initially off, and should remain off.
     */
    @Test
    public void directionChangeDoesNotChangeSpeed(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        assertTrue(context.getSpeed() instanceof OffState);
    }


}

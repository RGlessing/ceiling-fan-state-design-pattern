package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for testing the speed state functionality.
 */

public class DirectionStateTest {
    /**
     * This test will ensure that the Ceiling fan changes from the clockwise state to the counterclockwise state,
     * when a CeilingFanContext instance calls the pullDirectionChain method.
     */
    @Test
    public void TestChangeSettingClockwiseToCounterclockwise(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof CounterclockwiseState);
    }
    /**
     * This test will ensure that the Ceiling fan changes from the counterclockwise state to the clockwise state,
     * when a CeilingFanContext instance calls the pullDirectionChain method.
     */
    @Test
    public void TestChangeSettingCounterclockwiseToClockwise(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }
}

package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for testing the speed state functionality.
 *
 * @author Ryan Glessing
 */

public class SpeedStateTest {
    /**
     * This test will ensure that the Ceiling fan changes from the off state to the low state, when a
     * CeilingFanContext instance calls the pullSpeedChain method.
     */
    @Test
    public void testChangeSettingOffToLow(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof LowState);
    }

    /**
     * This test will ensure that the Ceiling fan changes from the low state to the medium state, when a
     * CeilingFanContext instance calls the pullSpeedChain method twice.
     */
    @Test
    public void testChangeSettingLowToMedium(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof MediumState);
    }

    /**
     * This test will ensure that the Ceiling fan changes from the medium state to the high state, when a
     * CeilingFanContext instance calls the pullSpeedChain method three times.
     */
    @Test
    public void testChangeSettingMediumToHigh(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        context.pullSpeedChain();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof HighState);
    }

    /**
     * This test will ensure that the Ceiling fan changes from the high state to the off state, when a
     * CeilingFanContext instance calls the pullSpeedChain method four times.
     */
    @Test
    public void testChangeSettingHighToOff(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        context.pullSpeedChain();
        context.pullSpeedChain();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof OffState);
    }

    /**
     * This test will ensure that the fan's direction is unaffected by a change in its speed when the speed chain
     * is pulled. A new fan is initially set to clockwise, and should remain set to spin clockwise.
     */
    @Test
    public void speedChangeDoesNotChangeDirection(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }
}

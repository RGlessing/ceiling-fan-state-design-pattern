package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for testing the speed state functionality.
 */

public class SpeedStateTest {
    /**
     * This test will ensure that the Ceiling fan changes from the off state to the low state, when a
     * CeilingFanContext instance calls the pullSpeedChain method.
     */
    @Test
    public void TestChangeSettingOffToLow(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof LowState);
    }

    /**
     * This test will ensure that the Ceiling fan changes from the low state to the medium state, when a
     * CeilingFanContext instance calls the pullSpeedChain method twice.
     */
    @Test
    public void TestChangeSettingLowToMedium(){
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
    public void TestChangeSettingMediumToHigh(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        context.pullSpeedChain();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof HighState);
    }
}

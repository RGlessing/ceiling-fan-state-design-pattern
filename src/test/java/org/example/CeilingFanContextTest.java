package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for CeilingFanContext.
 *
 * @author Ryan Glessing
 */
public class CeilingFanContextTest
{
    /**
     * This test will ensure a ceiling fan is initially in the off state when a CeilingFanContext object is
     * instantiated. It will also ensure the ceiling fan cycles through speed states.
     */
    @Test
    public void pullSpeedChain_startInOffState_cycleThroughSpeedStates(){
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context.getSpeed() instanceof OffState);
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof LowState);
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof MediumState);
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof HighState);
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof OffState);
    }

    /**
     * This test will ensure a ceiling fan is initially in the clockwise state when a CeilingFanContext object is
     * instantiated. It will also ensure the ceiling fan switches between direction states.
     */
    @Test
    public void pullDirectionChain_startInClockwiseState_cycleThroughDirectionStates(){
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context.getDirection() instanceof ClockwiseState);
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof CounterclockwiseState);
        context.pullDirectionChain();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }

    /**
     * This test will ensure that the fan's direction is unaffected by a change in its speed when the speed chain
     * is pulled. A new fan is initially set to clockwise, and should remain set to spin clockwise.
     */
    @Test
    public void pullDirectionChain_startInOffState_remainInOffState(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }

    /**
     * This test will ensure that the fan's speed is unaffected by a change in its direction when the direction chain
     * is pulled. A new fan is initially off, and should remain off.
     */
    @Test
    public void pullSpeedChain_startInClockwiseState_remainInClockwiseState(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullDirectionChain();
        assertTrue(context.getSpeed() instanceof OffState);
    }
}

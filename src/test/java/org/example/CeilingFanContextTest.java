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
     * This test will ensure the constructor defined in CeilingFanContext creates an instance of CeilingFanContext
     */
    @Test
    public void ceilingFanContextIsInstanceOf() {
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context instanceof CeilingFanContext);
    }

    /**
     * This test will ensure a ceiling fan is initially in the off state when a CeilingFanContext object is
     * instantiated.
     */
    @Test
    public void checkIfInitiallyOff(){
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context.getSpeed() instanceof OffState);
    }

    /**
     * This test will ensure a ceiling fan is initially in the clockwise state when a CeilingFanContext object is
     * instantiated.
     */
    @Test
    public void checkIfInitiallyClockwise(){
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context.getDirection() instanceof ClockwiseState);
    }

}

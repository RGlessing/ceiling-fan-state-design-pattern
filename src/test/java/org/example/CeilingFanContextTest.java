package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for CeilingFanContext.
 */
public class CeilingFanContextTest
{
    /**
     * This test will ensure the constructor defined in CeilingFanContext creates an instance of CeilingFanContext
     *
     * @author Ryan Glessing
     */
    @Test
    public void ceilingFanContextIsInstanceOf() {
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context instanceof CeilingFanContext);
    }

    /**
     * This test will ensure a ceiling fan is initially in the off state when a CeilingFanContext object is
     * instantiated.
     *
     * @author Ryan Glessing
     */
    @Test
    public void CheckIfInitiallyOff(){
        CeilingFanContext context = new CeilingFanContext();
        assertTrue(context.getSpeed() instanceof OffState);
    }

}

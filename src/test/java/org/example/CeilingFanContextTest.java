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
}

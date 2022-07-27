package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OffStateTest {
    @Test
    public void TestChangeSetting(){
        CeilingFanContext context = new CeilingFanContext();
        context.pullSpeedChain();
        assertTrue(context.getSpeed() instanceof LowState);
    }
}

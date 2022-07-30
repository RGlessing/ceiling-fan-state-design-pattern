package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClockwiseStateTest {
    private ClockwiseState clockwiseState;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        this.clockwiseState = new ClockwiseState();
    }

    /**
     * This test ensures the changeSetting method does not set the direction state to null
     */
    @Test
    public void changeSetting_nullCeilingStateContext_throwsException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("context must be set");

        this.clockwiseState.changeSetting(null);
    }
}
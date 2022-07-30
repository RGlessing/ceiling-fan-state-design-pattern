package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for OffStateTest.
 *
 * @author Ryan Glessing
 */

public class OffStateTest {
    private OffState offState;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        this.offState = new OffState();
    }

    /**
     * This test ensures the changeSetting method does not set the speed state to null
     */
    @Test
    public void changeSetting_nullCeilingStateContext_throwsException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("context must be set");

        this.offState.changeSetting(null);
    }
}
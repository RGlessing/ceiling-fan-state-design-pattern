package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for LowStateTest.
 *
 * @author Ryan Glessing
 */

public class LowStateTest {
    private LowState lowState;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        this.lowState = new LowState();
    }

    /**
     * This test ensures the changeSetting method does not set the speed state to null
     */
    @Test
    public void changeSetting_nullCeilingStateContext_throwsException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("context must be set");

        this.lowState.changeSetting(null);
    }
}
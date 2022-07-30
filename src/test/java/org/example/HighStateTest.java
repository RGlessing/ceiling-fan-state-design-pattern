package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HighStateTest {
    private HighState highState;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        this.highState = new HighState();
    }

    /**
     * This test ensures the changeSetting method does not set the speed state to null
     */
    @Test
    public void changeSetting_nullCeilingStateContext_throwsException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("context must be set");

        this.highState.changeSetting(null);
    }
}
package org.example;

import org.apache.commons.lang3.Validate;

/**
 * This is the class file for a ClockwiseState object. The ClockwiseState implements the DirectionState interface.
 * It contains the method changeSetting, that changes the fan's direction to counterclockwise.
 *
 * @author Ryan Glessing
 */

public class ClockwiseState implements DirectionState{

    /**
     * When called, this method will use the setDirection method of a CeilingFanContext object to change the current
     * direction. The direction will be set to counterclockwise.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        Validate.notNull(context, "context must be set");
        context.setDirection(new CounterclockwiseState());
    }
}

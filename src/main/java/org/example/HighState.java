package org.example;

import org.apache.commons.lang3.Validate;

/**
 * This is the class file for a HighState object. The HighState implements the SpeedState interface. It contains
 * the method changeSetting, that changes the fan speed from the high to off state.
 *
 * @author Ryan Glessing
 */

public class HighState implements SpeedState{

    /**
     * When called, this method will use the setSpeed method of a CeilingFanContext object to change the current
     * speed. The fan will be turned off.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        Validate.notNull(context, "context must be set");
        context.setSpeed(new OffState());
    }
}

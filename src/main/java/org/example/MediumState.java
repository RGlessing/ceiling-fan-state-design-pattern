package org.example;

import org.apache.commons.lang3.Validate;

/**
 * This is the class file for a MediumState object. The MediumState implements the SpeedState interface. It contains
 * the method changeSetting, that changes the fan speed from medium to high.
 *
 * @author Ryan Glessing
 */

public class MediumState implements SpeedState{

    /**
     * When called, this method will use the setSpeed method of a CeilingFanContext object to change the current
     * speed. The speed will be set to high.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        Validate.notNull(context, "context must be set");
        context.setSpeed(new HighState());
    }

    @Override
    public String toString() {
        return "MediumState{}";
    }
}

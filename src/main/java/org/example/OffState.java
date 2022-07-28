package org.example;

/**
 * This is the class file for an OffState object. The OffState implements the SpeedState interface. It contains
 * the method changeSetting, that changes the fan speed from off to low.
 *
 * @author Ryan Glessing
 */

public class OffState implements SpeedState{

    /**
     * When called, this method will use the setSpeed method of a CeilingFanContext object to change the current
     * speed. The speed will be set to low.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        context.setSpeed(new LowState());
    }
}

package org.example;

/**
 * This is the class file for a LowState object. The LowState implements the SpeedState interface. It contains
 * the method changeSetting, that changes the fan speed from low to medium.
 *
 * @author Ryan Glessing
 */
public class LowState implements SpeedState {

    /**
     * When called, this method will use the setSpeed method of a CeilingFanContext object to change the current
     * speed. The speed will be set to medium.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        context.setSpeed(new MediumState());
    }
}

package org.example;

public class CounterclockwiseState implements DirectionState{

    /**
     * When called, this method will use the setDirection method of a CeilingFanContext object to change the current
     * direction. The direction will be set to clockwise.
     *
     * @param context The Ceiling Fan Context
     */
    @Override
    public void changeSetting(CeilingFanContext context) {
        context.setDirection(new ClockwiseState());
    }
}

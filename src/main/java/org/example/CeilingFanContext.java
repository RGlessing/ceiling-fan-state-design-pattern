package org.example;

/**
 * This is the class file for CeilingFanContext.
 *
 * @author Ryan Glessing
 */
public class CeilingFanContext {
    private SpeedState speed;

    public CeilingFanContext(){
        this.speed = new OffState();
    }

    /**
     * Get method used to return the current fan speed
     *
     * @return The current speed of the fan
     */
    public SpeedState getSpeed() { return speed; }

    /**
     * Set method used to change the fan speed.
     *
     * @param speed The new fan speed
     */
    public void setSpeed(SpeedState speed) { this.speed = speed; }

    /**
     * Simulates pulling the fan's speed chain. Calls the changeSetting function of the speed attribute, which
     * is in the off, low, medium, or high state. This will use the setSpeed function of this class to set it to the
     * next speed setting. If speed is set to the high state, it is next set to the off state.
     */
    public void pullSpeedChain(){ speed.changeSetting(this);}

}

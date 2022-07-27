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

    public void pullSpeedChain(){ speed.changeSetting(this);}

}

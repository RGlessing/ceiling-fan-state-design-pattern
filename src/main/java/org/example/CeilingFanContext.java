package org.example;

/**
 * This is the class file for CeilingFanContext.
 *
 * @author Ryan Glessing
 */
public class CeilingFanContext {
    private SpeedState speed;
    private DirectionState direction;

    public CeilingFanContext(){
        speed = new OffState();
        direction = new ClockwiseState();
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
     * Get method used to return the current fan direction
     *
     * @return The current direction of the fan
     */
    public DirectionState getDirection() { return direction; }

    /**
     * Set method used to change the fan's direction.
     *
     * @param direction The new fan direction
     */
    public void setDirection(DirectionState direction) { this.direction = direction; }

    /**
     * Simulates pulling the fan's speed chain. Calls the changeSetting function of the speed attribute, which
     * is in the off, low, medium, or high state. This will use the setSpeed function of this class to set it to the
     * next speed setting. If speed is set to the high state, it is next set to the off state.
     */
    public void pullSpeedChain(){ speed.changeSetting(this);}

}

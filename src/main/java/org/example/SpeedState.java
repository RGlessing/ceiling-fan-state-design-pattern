package org.example;

/**
 * This is an interface SpeedState that will be implemented by each speed setting of a ceiling fan. Each state
 * should have a method changeSetting to simulate the pulling of the ceiling fan's speed chain to change its current
 * speed.
 *
 * @author Ryan Glessing
 */

public interface SpeedState {
    /**
     * This method is implemented by speed states. The implementations will use this method to change a fan's
     * speed.
     *
     * @param context The Ceiling Fan Context
     */
    void changeSetting(CeilingFanContext context);
}

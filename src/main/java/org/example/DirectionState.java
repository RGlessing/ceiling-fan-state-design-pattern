package org.example;

/**
 * This is an interface DirectionState that will be implemented by each direction setting of a ceiling fan. Each state
 * should have a method changeSetting to simulate the pulling of the ceiling fan's direction chain to change its current
 * direction.
 *
 * @author Ryan Glessing
 */

public interface DirectionState {
    void changeSetting(CeilingFanContext context);
}

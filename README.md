# Ceiling Fan Using State Design Pattern

## Overview

This project is intended to simulate a ceiling fan using the [state design pattern](https://www.tutorialspoint.com/design_pattern/state_pattern.htm). The fan has two chains that are used to change its speed and direction. The fan has four speed states, which are off, low, medium, and high. Pulling the speed chain will change the fans speed to the next state in the order given. If it is in the high state, then the fan will return to the off state. The fan has two direction states, clockwise and counterclockwise. Pulling the direction chain will alternate the fan's direction between clockwise and counterclockwise. 

## Intended Use

A ceiling fan object is the only object that is required to be instantiated for use of this project. The following methods listed below describe the functionality of a ceiling fan. It is not necessary to use the get and set methods to operate a ceiling fan, only the pull chain methods.  

**void : pullSpeedChain** Cycles through the speed states off, low, medium, and high

**void : pullDirectionChain** Alternates between the direction states clockwise and counterclockwise

**SpeedState : getSpeed** Returns the curent speed state

**void : setSpeed** Sets new speed state

**DirectionState : getDirection** Returns the curent direction state

**void : setDirection** Sets new direction state

## Testing

jUnit4 was used for testing this project. The relevent test cases for this project can be found in the files listed below.

- [CeilingFanContextTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/CeilingFanContextTest.java)
- [ClockwiseStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/ClockwiseStateTest.java)
- [CounterclockwiseStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/CounterclockwiseStateTest.java)
- [OffStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/OffStateTest.java)
- [LowStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/LowStateTest.java)
- [MediumStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/MediumStateTest.java)
- [HighStateTest](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/03733a129b9f4b6b6cefea77952f6d7f403d2a02/src/test/java/org/example/HighStateTest.java)

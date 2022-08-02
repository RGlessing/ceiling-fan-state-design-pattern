# Ceiling Fan Using State Design Pattern

## Overview

This project is intended to simulate a ceiling fan using the [state design pattern](https://www.tutorialspoint.com/design_pattern/state_pattern.htm). The fan has two chains that are used to change its speed and direction. The fan has four speed states, which are off, low, medium, and high. Pulling the speed chain will change the fans speed to the next state in the order given. If it is in the high state, then the fan will return to the off state. The fan has two direction states, clockwise and counterclockwise. Pulling the direction chain will alternate the fan's direction between clockwise and counterclockwise. 

## Testing

jUnit4 was used to unit test this project. Tests can be found [here](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/81abe689e4fc6b4c0a2e2dc7cc019678737b0c0a/src/test/java/org/example/). 

## Demo

This project has a main method used only for demonstration. It cycles through each of the speed and direction states. It can be found [here](https://github.com/RGlessing/ceiling-fan-state-design-pattern/blob/81abe689e4fc6b4c0a2e2dc7cc019678737b0c0a/src/main/java/org/example/Demo.java).

# Ceiling Fan Using State Design Pattern

## Overview

This project is intended to simulate a ceiling fan using the state design pattern. The fan has two chains, that are used to change its speed and direction. The fan has four speed states, which are off, low, medium, and high. Pulling the speed chain will change the fans speed to the next state in the order given. If it is in the high state, then the fan will return to the off state. The fan has two direction states, which are clockwise and counterclockwise. Pulling the direction chain will alternate the fan's direction between clockwise and counterclockwise. 

## Installation

**HTTP**

git clone https://github.com/RGlessing/ceiling-fan-state-design-pattern.git

## Testing

jUnit was used for testing this project. The relevent test cases for this project can be found in the files listed below.

- ceiling-fan-state-design-pattern/src/test/java/org/example/CeilingFanContextTest.java
- ceiling-fan-state-design-pattern/src/test/java/org/example/DirectionStateTest.java
- ceiling-fan-state-design-pattern/src/test/java/org/example/SpeedStateTest.java

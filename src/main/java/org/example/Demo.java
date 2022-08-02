package org.example;

/**
 * This file is a demo used to demonstrate the functionality of this project.
 * Unit tests are present within the test folder that also demonstrate that the
 * project works as intended.
 *
 * @author Ryan Glessing
 */
public class Demo {
    public static void main(String[] Args){
        /*
         * Initialize Ceiling fan. Begin in off and clockwise states.
         */
        CeilingFanContext context = new CeilingFanContext();
        System.out.println(context);

        /*
         * Pull speed chain. Change speed state from off to low.
         * Direction state remains in clockwise state.
         */
        context.pullSpeedChain();
        System.out.println(context);

        /*
         * Pull speed chain. Change speed state from low to medium.
         * Direction state remains in clockwise state.
         */
        context.pullSpeedChain();
        System.out.println(context);

        /*
         * Pull speed chain. Change speed state from medium to high.
         * Direction state remains in clockwise state.
         */
        context.pullSpeedChain();
        System.out.println(context);

        /*
         * Pull direction chain. Change direction state from clockwise to counterclockwise.
         * Speed state remains in high state.
         */
        context.pullDirectionChain();
        System.out.println(context);

        /*
         * Pull direction chain. Change direction state from counterclockwise to clockwise.
         * Speed state remains in high state.
         */
        context.pullDirectionChain();
        System.out.println(context);

        /*
         * Pull speed chain. Change speed state from high to off.
         * Direction state remains in clockwise state.
         */
        context.pullSpeedChain();
        System.out.println(context);
    }
}

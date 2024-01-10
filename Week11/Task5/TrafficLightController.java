package org.example.Week11.Task5;

public class TrafficLightController {
    public static void main(String[] args) {

        TrafficLightContext context = new TrafficLightContext();

        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToGreen();
    }
}

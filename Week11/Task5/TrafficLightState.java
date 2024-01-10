package org.example.Week11.Task5;

public interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
}

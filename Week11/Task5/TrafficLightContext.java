package org.example.Week11.Task5;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;

    public TrafficLightContext() {
        this.trafficLightState= new RedLightState();
    }
    public void setState(TrafficLightState state){
        this.trafficLightState=state;
    }
    public void transitionToRed() {
        trafficLightState.transitionToRed(this);
    }

    public void transitionToGreen() {
        trafficLightState.transitionToGreen(this);
    }

    public void transitionToYellow() {
        trafficLightState.transitionToYellow(this);
    }

}

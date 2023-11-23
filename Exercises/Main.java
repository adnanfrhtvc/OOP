package org.example.Exercises;

import java.io.StringBufferInputStream;

interface Drivable{
    abstract String drive();
}
class Car implements Drivable{
    private String meterSound;
    @Override
    public String drive(){
        return this.meterSound.concat(" is the sound");
    }
    public String getMeterSound(){
        return this.meterSound;
    }
    public void setMeterSound(String meterSound){
        this.meterSound=meterSound;
    }
    Car(String meterSound){
        this.meterSound=meterSound;
    }

}
class Scooter implements Drivable{
    private String sound;
    Scooter(String sound){
        this.sound=sound;
    }
    @Override
    public String drive(){
        return this.sound.concat(" is the sound");
    }
    public String getSound(){
        return this.sound;
    }
    public void setSoud(String sound){
        this.sound=sound;
    }
}
package org.example.Week11.Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();

        NewDevice newDevice = new DeviceAdapter(oldDevice);
        newDevice.operateNewDeviceFunction();
    }
}

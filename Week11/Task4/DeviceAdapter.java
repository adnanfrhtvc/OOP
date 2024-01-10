package org.example.Week11.Task4;

public class DeviceAdapter implements NewDevice{
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }
    @Override
    public void operateNewDeviceFunction() {
        System.out.println("Adapting to old device");
        oldDevice.operateOldDeviceFunction();
    }
}

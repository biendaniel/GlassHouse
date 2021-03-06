package deviceControl;

import conditions.Condition;

public class AdjustLighting implements DeviceControlStrategy {

    @Override
    public void adjustDevice(Condition condition, Condition currentCondition) {
        devices.fillLightIntensityDevices();
        devices.getLightIntensityDevice().handle(condition, currentCondition);
    }
}

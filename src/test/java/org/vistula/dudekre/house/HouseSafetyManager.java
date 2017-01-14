package org.vistula.dudekre.house;

import java.util.ArrayList;
import java.util.List;

public class HouseSafetyManager {
    private List<Switchable> switchableHouseDevices = new ArrayList<Switchable>();

    public void addSwitchableDevice(Switchable device) {
        switchableHouseDevices.add(device);
    }

    public void turnAllOff() {
        for (Switchable  device : switchableHouseDevices) {
            device.turnOff();
        }
    }
}

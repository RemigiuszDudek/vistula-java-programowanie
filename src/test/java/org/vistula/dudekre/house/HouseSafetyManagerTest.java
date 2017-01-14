package org.vistula.dudekre.house;

import org.junit.Test;

public class HouseSafetyManagerTest {
    @Test
    public void shouldTurnDevicesOff() {
        HouseSafetyManager safetyManager = new HouseSafetyManager();

        safetyManager.addSwitchableDevice(new Lamp());
        safetyManager.addSwitchableDevice(new WashingMachine());

        safetyManager.turnAllOff();
    }

}
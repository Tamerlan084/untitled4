package kz.zhabassov.project.electricalAppliances.entity;

import kz.zhabassov.project.electricalAppliances.entity.ElectricalAppliance;

public class Iron extends ElectricalAppliance {
    public Iron(String name, double power) {
        super(name, power, false);
    }
}

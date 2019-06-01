package kz.zhabassov.project.electricalAppliances.entity;

import kz.zhabassov.project.electricalAppliances.entity.ElectricalAppliance;

public class Stove extends ElectricalAppliance {
    public Stove(String name, double power) {
        super(name, power, false);
    }
}

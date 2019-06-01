package kz.zhabassov.project.electricalAppliances.entity;

import kz.zhabassov.project.electricalAppliances.entity.ElectricalAppliance;

public class VacuumCleaner extends ElectricalAppliance {
    public VacuumCleaner(String name, double power) {
        super(name, power, false);

    }
}

package kz.zhabassov.project.electricalAppliances.main;

import kz.zhabassov.project.electricalAppliances.Actions.ActionsInHome;
import kz.zhabassov.project.electricalAppliances.Home.Home;
import kz.zhabassov.project.electricalAppliances.entity.Iron;
import kz.zhabassov.project.electricalAppliances.entity.Stove;
import kz.zhabassov.project.electricalAppliances.entity.VacuumCleaner;

public class Main {
    public static void main(String[] args) {
        Iron iron1 = new Iron("Утюг", 1200f);
        Stove stove1 = new Stove("Плита", 6000f);
        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Пылесос", 1500f);

        Home home1 = new Home(iron1, stove1);

        ActionsInHome.addElectricalAppliance(home1, vacuumCleaner1);

        double power = ActionsInHome.countPower(home1);

        ActionsInHome.findByPowerRange(home1, 1300, 2000);

        ActionsInHome.sortByPower(home1);

        ActionsInHome.plagIn(home1, vacuumCleaner1);

    }
}

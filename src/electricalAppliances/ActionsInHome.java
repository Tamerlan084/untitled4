package electricalAppliances;

import java.util.ArrayList;

public class ActionsInHome {

    public static void addElectricalAppliance(Home home, ElectricalAppliance electricalAppliance) {
        home.electricalApplianceList.add(electricalAppliance);
    }

    public static double countPower(Home home)
    {
        double power = 0;
        for(ElectricalAppliance electricalAppliance : home.electricalApplianceList)
        {
            power += electricalAppliance.getPower();
        }
        return power;
    }

    public static void sortByPower(Home home) {
        ArrayList<ElectricalAppliance> electricalAppliancesSorted = new ArrayList<ElectricalAppliance>();

        double min = Double.MAX_VALUE;
        ElectricalAppliance minElectricalAppliance = null;

        for (ElectricalAppliance electricalAppliance1 : home.electricalApplianceList) {
            for (ElectricalAppliance electricalAppliance2 : home.electricalApplianceList) {
                if (electricalAppliance2.getPower() < min) {
                    minElectricalAppliance = electricalAppliance2;
                }
            }
            electricalAppliancesSorted.add(minElectricalAppliance);
            home.electricalApplianceList.remove(minElectricalAppliance);
        }

        home.electricalApplianceList = electricalAppliancesSorted;
    }

    public static ElectricalAppliance findByPowerRange(Home home, int minPower, int maxPower) {
        ElectricalAppliance electricalAppliance1 = null;

        for (ElectricalAppliance electricalAppliance2 : home.electricalApplianceList) {
            if (electricalAppliance2.getPower() >= minPower && electricalAppliance2.getPower() <= maxPower) {
                electricalAppliance1 = electricalAppliance2;
                break;
            }
        }
        return electricalAppliance1;
    }

    public static void plagIn(Home home, ElectricalAppliance electricalAppliance1) {
        for (ElectricalAppliance electricalAppliance2 : home.electricalApplianceList) {
            if (electricalAppliance2.equals(electricalAppliance1)) {
                electricalAppliance2.setPlugIn(true);
            }
        }
    }

}

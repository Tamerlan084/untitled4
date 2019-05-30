package electricalAppliances;

import java.util.ArrayList;

public class ActionsInHome {
    public static float countPower(Home home)
    {
        float power = 0;
        for(ElectricalAppliance electricalAppliance : home.electricalApplianceList)
        {
            power+=electricalAppliance.
        }

        return power;
    }
}

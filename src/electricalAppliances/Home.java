package electricalAppliances;

import java.util.ArrayList;
import java.util.Arrays;

public class Home {
    ArrayList<ElectricalAppliance> electricalApplianceList = new ArrayList<ElectricalAppliance>();

    public Home(ElectricalAppliance... electricalAppliance) {
        electricalApplianceList.addAll(Arrays.asList(electricalAppliance));
    }
}

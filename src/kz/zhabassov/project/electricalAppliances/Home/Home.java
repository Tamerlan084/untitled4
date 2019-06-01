package kz.zhabassov.project.electricalAppliances.Home;

import kz.zhabassov.project.electricalAppliances.entity.ElectricalAppliance;

import java.util.ArrayList;
import java.util.Arrays;

public class Home {
    //collections unmodifaible
    //коллекции полиморфизм, переопределение, перегрузка
    //ID generator
    //два три подкласса
    // избегать множ чисел
    // stringbuilder
    // fluffycat.com
    //логеры надо сделать
    public ArrayList<ElectricalAppliance> electricalApplianceList = new ArrayList<ElectricalAppliance>();

    public Home(ElectricalAppliance... electricalAppliance) {
        electricalApplianceList.addAll(Arrays.asList(electricalAppliance));
    }
}

package kz.zhabassov.project.electricalAppliances.entity;

public abstract class ElectricalAppliance {

    private String name;
    private double power;
    private boolean plugIn;

    public ElectricalAppliance(String name, double power, boolean plugIn) {
        this.name = name;
        this.power = power;
        this.plugIn = plugIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isPlugIn() {
        return plugIn;
    }

    public void setPlugIn(boolean plugIn) {
        this.plugIn = plugIn;
    }
}

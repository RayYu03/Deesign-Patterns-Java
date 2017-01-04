package ch11;

/**
 * Created by RayYu on 2016/12/11.
 */
public abstract class Manufacturer {
    protected Appliance appliance;
    public void setAppliance(Appliance appliance){
        this.appliance = appliance;
    }
    public abstract void produce();
}

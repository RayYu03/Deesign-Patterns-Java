package ch11;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Client {
    public static void main(String[] args){
        Appliance appliance, appliance1;
        Manufacturer manufacturer, manufacturer2;

        appliance = new Television();
        manufacturer = new Haier();

        manufacturer.setAppliance(appliance);
        manufacturer.produce();


        appliance1 = new AirConditioner();
        manufacturer2 = new TCL();

        manufacturer2.setAppliance(appliance1);
        manufacturer2.produce();
    }
}

package ch11;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Haier extends Manufacturer{
    public void produce(){
        System.out.print("生产海尔产品：");
        appliance.assemble();
    }
}

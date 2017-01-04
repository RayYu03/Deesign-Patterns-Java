package ch11;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Hisense extends Manufacturer{
    public void produce(){
        System.out.print("生产海信产品：");
        appliance.assemble();
    }
}

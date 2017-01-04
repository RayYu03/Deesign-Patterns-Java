package ch11;

/**
 * Created by RayYu on 2016/12/11.
 */
public class TCL extends Manufacturer{
    public void produce(){
        System.out.print("生产TCL产品：");
        appliance.assemble();
    }
}

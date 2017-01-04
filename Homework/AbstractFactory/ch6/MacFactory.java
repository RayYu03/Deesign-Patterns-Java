package ch6;

/**
 * Created by RayYu on 2016/12/7.
 */
public class MacFactory implements AbstractFactory{
    public CPU getCPU(){
        return new MacCPU();
    }
    public RAM getRAM(){
        return new MacRAM();
    }

}

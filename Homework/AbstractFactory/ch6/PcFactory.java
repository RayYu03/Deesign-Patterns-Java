package ch6;

/**
 * Created by RayYu on 2016/12/7.
 */
public class PcFactory implements AbstractFactory {
    public CPU getCPU(){
        return new PcCPU();
    }
    public RAM getRAM(){
        return new PcRAM();
    }
}

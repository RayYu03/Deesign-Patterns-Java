package ch6;

/**
 * Created by RayYu on 2017/1/4.
 */
public class client {
    public static void main(String[] args){
        CPU macCPU, pcCPU;
        RAM macRAM, pcRAM;

        macCPU = new MacFactory().getCPU();
        macCPU.show();

        macRAM = new MacFactory().getRAM();
        macRAM.show();

        pcCPU = new PcFactory().getCPU();
        pcCPU.show();

        pcRAM = new PcFactory().getRAM();
        pcRAM.show();
    }
}

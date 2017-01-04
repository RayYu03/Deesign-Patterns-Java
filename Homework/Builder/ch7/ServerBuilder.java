package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public class ServerBuilder extends ComputerBulider {
    public void buildCpu() {
        computer.setCpu("Server CPU.");
    }

    public void buildRam(){
        computer.setRam("Server ram.");
    }
}

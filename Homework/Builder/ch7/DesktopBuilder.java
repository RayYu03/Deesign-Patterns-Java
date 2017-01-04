package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public class DesktopBuilder extends ComputerBulider {
    public void buildCpu() {
        computer.setCpu("Desktop CPU.");
    }

    public void buildRam(){
        computer.setRam("Desktop ram.");
    }
}

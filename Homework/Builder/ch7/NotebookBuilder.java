package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public class NotebookBuilder extends ComputerBulider {
    public void buildCpu() {
        computer.setCpu("Notebook CPU.");
    }

    public void buildRam(){
        computer.setRam("Notebook ram.");
    }
}

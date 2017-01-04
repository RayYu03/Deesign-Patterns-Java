package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public abstract class ComputerBulider {
    protected Computer computer = new Computer();
    public abstract void buildCpu();
    public abstract void buildRam();
    public Computer produceComputer(){
        return computer;
    }
}

package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public class ComputerAssembleDirector {
    private ComputerBulider cb;
    public void setComputerBulider(ComputerBulider cb){
        this.cb = cb;
    }

    public Computer assemble(){
        cb.buildCpu();
        cb.buildRam();
        return cb.produceComputer();
    }
}

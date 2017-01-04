package ch18;

/**
 * Created by RayYu on 2016/12/19.
 */
public class ExitCommand implements Command{
    private SystemExitClass systemExitClass;
    public ExitCommand(SystemExitClass systemExitClass){
        this.systemExitClass = systemExitClass;
    }
    public void execute(){
        systemExitClass.exit();
    }
}

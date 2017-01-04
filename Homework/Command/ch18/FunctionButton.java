package ch18;

/**
 * Created by RayYu on 2016/12/19.
 */
public class FunctionButton {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

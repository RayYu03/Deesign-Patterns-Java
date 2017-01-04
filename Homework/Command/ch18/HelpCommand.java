package ch18;

/**
 * Created by RayYu on 2016/12/19.
 */
public class HelpCommand implements Command{
    private DisplayHelpClass displayHelpClass;
    public HelpCommand(DisplayHelpClass displayHelpClass){
        this.displayHelpClass = displayHelpClass;
    }
    public void execute(){
        displayHelpClass.display();
    }
}

package ch18;

/**
 * Created by RayYu on 2016/12/19.
 */
public class Client {
    public static void main(String[] args){
        FunctionButton button = new FunctionButton();

        HelpCommand help = new HelpCommand(new DisplayHelpClass());
        ExitCommand exit = new ExitCommand(new SystemExitClass());

        button.setCommand(help);
        button.click();

        button.setCommand(exit);
        button.click();

    }
}

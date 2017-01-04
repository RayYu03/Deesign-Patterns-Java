package ch16;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Picture implements Subject{
    private Application application;

    public Picture(){
        application = new Application();
    }

    public void run(){
        application.run();
    }
}

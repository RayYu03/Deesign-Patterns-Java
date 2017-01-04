package ch13;

/**
 * Created by RayYu on 2016/12/12.
 */
public class BlackBorderDecorator extends Decorator {
    public BlackBorderDecorator(Component component){
        super(component);
    }

    public void display(){
        System.out.println("添加黑边");
        super.display();
    }
}

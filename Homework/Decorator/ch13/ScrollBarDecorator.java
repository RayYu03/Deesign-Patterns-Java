package ch13;

/**
 * Created by RayYu on 2016/12/12.
 */
public class ScrollBarDecorator extends Decorator{
    public ScrollBarDecorator(Component component){
        super(component);
    }

    public void display(){
        System.out.println("添加滚动条");
        super.display();
    }
}

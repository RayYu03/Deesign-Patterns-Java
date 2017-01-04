package ch13;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Decorator extends Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }

    public void display(){
        component.display();
    }
}

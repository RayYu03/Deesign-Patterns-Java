package ch10;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Client {
    public static void main(String[] args){

        Adapter adapter = new Adapter(new ConcreteCat(), new ConcreteDog());

        Cat cat = adapter;

        cat.miao();

        Dog dog = adapter;

        dog.jump();

    }
}

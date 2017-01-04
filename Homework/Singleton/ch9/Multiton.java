package ch9;
import java.util.*;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Multiton {
    private static Multiton[] array = {
            new Multiton(), new Multiton(), new Multiton()
    };

    private Multiton(){

    }

    public static Multiton getInstance(){
        return array[random()];
    }

    public static int random(){
        Date d = new Date();
        Random random = new Random();
        int value = Math.abs(random.nextInt());
        value = value % 3;
        return value;
    }

}

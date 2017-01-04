package ch9;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Client {

    public static void main(String[] args){
        Multiton m1, m2, m3;

        m1 = Multiton.getInstance();
        m2 = Multiton.getInstance();
        m3 = Multiton.getInstance();

        System.out.println(m1 == m2);
        System.out.println(m1 == m3);
        System.out.println(m2 == m3);
    }
}

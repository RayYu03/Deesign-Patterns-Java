package ch15;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Client {
    public static void main(String[] args){
        SharedString str1, str2;
        SharedStringFactory factory = new SharedStringFactory();

        str1 = factory.getSharedString("Java");
        str1.setColor(new Color("Red"));
        str1.setSize(new Size(5));

        str1.display();

        System.out.println();

        str2 = factory.getSharedString("Java");
        str2.setColor(new Color("Black"));
        str2.setSize(new Size(12));

        str2.display();


    }
}

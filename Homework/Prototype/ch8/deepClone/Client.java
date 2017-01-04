package ch8.deepClone;

import java.io.IOException;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("New York City","trump@gmail.com","4523299");

        Customer trump = new Customer(address);
        trump.display();

        Customer copyTrump = (Customer) trump.deepClone();
        copyTrump.display();

        System.out.print("trump == copyTrump? ");
        System.out.println(trump == copyTrump);

        System.out.print("trump.getAddress() == copyTrump.getAddress()? ");
        System.out.println(trump.getAddress() == copyTrump.getAddress());

    }
}

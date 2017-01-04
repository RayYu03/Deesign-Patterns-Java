package ch8.clone;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Client {
    public static void main(String[] args){
        ch8.clone.Address address = new ch8.clone.Address("New York City","trump@gmail.com","4523299");

        Customer trump = new Customer(address);
        trump.display();

        Customer copyTrump = (Customer)trump.clone();
        copyTrump.display();

        System.out.print("trump == copyTrump? ");
        System.out.println(trump == copyTrump);

        System.out.print("trump.getAddress() == copyTrump.getAddress()? ");
        System.out.println(trump.getAddress() == copyTrump.getAddress());

    }
}

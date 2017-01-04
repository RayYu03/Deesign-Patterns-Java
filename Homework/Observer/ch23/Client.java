package ch23;

public class Client {
    public static void main(String args[]){
        Ally ally = new Ally();
        Observer player1 = new Player("队长");
        Observer player2 = new Player("队员1");
        Observer player3 = new Player("队员2");

        ally.join(player1);
        ally.join(player2);
        ally.join(player3);
        player1.beAttacked(ally);
    }
}

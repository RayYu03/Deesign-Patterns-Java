package ch23;

import java.util.ArrayList;
public class Ally {
    private ArrayList<Observer> players = new ArrayList<Observer>();
    public void join(Observer obs){
        players.add(obs);
    }
    public void quit(Observer obs){
        players.remove(obs);
    }
    public void notifyObserver(String name){
        System.out.println("小心了，"+name +" 正在被攻击");
        for(Observer player: players){
            if(player.getName() != name)
                player.help();
        }
    }
}

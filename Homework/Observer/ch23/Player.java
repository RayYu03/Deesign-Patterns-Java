package ch23;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println(this.name + " 马上过来支援你");
    }

    @Override
    public void beAttacked(Ally ally) {
        System.out.println(this.getName() +"正在被攻击");
        ally.notifyObserver(name);
    }
}

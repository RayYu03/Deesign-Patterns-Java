package ch12;

import java.util.ArrayList;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Institution extends Unit{
    private String name;
    private ArrayList list = new ArrayList();

    public Institution(String name){
        this.name = name;
    }

    public void add(Unit unit){
        list.add(unit);
    }

    public void remove(Unit unit){
        list.remove(unit);
    }

    public void handleArchives(){
        System.out.println(this.name + "接收并下发公文。");
        for (Object obj : list){
            ((Unit)obj).handleArchives();
        }
    }
}

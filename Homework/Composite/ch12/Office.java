package ch12;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Office extends Unit{
    private String name;

    public Office(String name){
        this.name = name;
    }

    public void handleArchives(){
        System.out.println(this.name + "处理公文!");
    }
}

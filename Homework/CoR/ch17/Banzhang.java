package ch17;


/**
 * Created by RayYu on 2016/12/12.
 */
public class Banzhang extends Officer{

    public Banzhang(String name){
        super(name);
    }

    public void handleRequest(Mission request){
        if(request.getEnemyNumber() < 10){
            System.out.println("班长" + name + "下达代号为" +
            request.getCode()+ "的作战任务，敌人数量为" +
            request.getEnemyNumber());
        }
        else {
            if(this.successor != null){
                this.successor.handleRequest(request);
            }
        }
    }
}

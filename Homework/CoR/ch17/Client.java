package ch17;

/**
 * Created by RayYu on 2016/12/12.
 */


public class Client {
    public static void main(String[] args){
        Officer banzhang, paizhang, yingzhang;
        banzhang = new Banzhang("王璐瑶");
        paizhang = new Paizhang("于子勇");
        yingzhang = new Yingzhang("刘坤");

        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        Mission mission1 = new Mission("8896", 5);
        Mission mission2 = new Mission("8896", 20);
        Mission mission3 = new Mission("8896", 150);
        Mission mission4 = new Mission("8896", 300);

        banzhang.handleRequest(mission1);
        banzhang.handleRequest(mission2);
        banzhang.handleRequest(mission3);
        banzhang.handleRequest(mission4);



    }
}

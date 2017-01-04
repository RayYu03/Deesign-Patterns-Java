package ch17;

/**
 * Created by RayYu on 2016/12/12.
 */
public class Mission {
    private String code;
    private int enemyNumber;

    public Mission(String code, int enemyNumber){
        setCode(code);
        setEnemyNumber(enemyNumber);
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setEnemyNumber(int enemyNumber){
        this.enemyNumber = enemyNumber;
    }

    public String getCode(){
        return code;
    }

    public int getEnemyNumber(){
        return enemyNumber;
    }
}

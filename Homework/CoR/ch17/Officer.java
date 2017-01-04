package ch17;

import ch12.Office;

/**
 * Created by RayYu on 2016/12/12.
 */
abstract class Officer {
    protected String name;
    protected Officer successor;
    public Officer(String name){
        this.name = name;
    }
    public void setSuccessor(Officer successor){
        this.successor = successor;
    }
    public abstract void handleRequest(Mission request);

}

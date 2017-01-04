package ch15;

import java.util.Hashtable;

/**
 * Created by RayYu on 2016/12/12.
 */
public class SharedStringFactory {
    private Hashtable ht;
    public SharedStringFactory(){
        ht = new Hashtable();
    }
    public SharedString getSharedString(String arg){
        if(ht.containsKey(arg)){
            return (SharedString)ht.get(arg);
        }
        else {
            SharedString str = new SharedString(arg);
            ht.put(arg, str);
            return (SharedString)ht.get(arg);
        }
    }
}

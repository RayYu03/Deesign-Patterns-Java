package ch20;

import java.util.Comparator;
import java.util.function.ToLongFunction;

/**
 * Created by RayYu on 2016/12/23.
 */
public class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Student student1 = (Student)obj1;
        Student student2 = (Student)obj2;
        if (student1.getAge() < student2.getAge()){
            return 1;
        }
        else {
            return 0;
        }
    }
}

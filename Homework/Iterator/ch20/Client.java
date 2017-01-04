package ch20;

/**
 * Created by RayYu on 2016/12/23.
 */
public class Client {
    public static void main(String[] args){
        Class obj = new Class();
        Student student1, student2;
        student1 = new Student("杨过", 20, "男");
        student2 = new Student("小龙女", 25, "女");

        obj.addStudent(student1);
        obj.addStudent(student2);
        obj.displayStudents();
    }
}

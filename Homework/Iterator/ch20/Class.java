package ch20;

import java.util.*;

/**
 * Created by RayYu on 2016/12/23.
 */
public class Class {
    private ArrayList <Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        Comparator comp = new MyComparator();
        Collections.sort(students, comp);
        Iterator i = students.iterator();
        while (i.hasNext()){
            Student student = (Student)i.next();
            System.out.println("姓名：" + student.getName() + ",年龄:" + student.getAge());
        }
    }

}

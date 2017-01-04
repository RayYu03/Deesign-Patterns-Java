package ch20;

/**
 * Created by RayYu on 2016/12/23.
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex){
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}

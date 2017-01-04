package ch10;

/**
 * Created by RayYu on 2016/12/11.
 */
public class Adapter implements Dog, Cat{
    private Cat cat;
    private Dog dog;

    public Adapter(Cat cat, Dog dog){
        setCat(cat);
        setDog(dog);
    }

    public void setCat(Cat cat){
        this.cat = cat;
    }
    public Cat getCat(){
        return cat;
    }

    public void setDog(Dog dog){
        this.dog = dog;
    }
    public Dog getDog(){
        return dog;
    }

    public void miao(){
        System.out.print("猫模仿狗叫: ");
        dog.wang();
    }

    public void catchMouse(){
        cat.catchMouse();
    }

    public void wang(){
        dog.wang();
    }

    public void jump(){
        System.out.print("狗模仿猫: ");
        cat.catchMouse();
    }
}

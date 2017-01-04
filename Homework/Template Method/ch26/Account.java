package ch26;

/**
 * Created by RayYu on 2016/12/23.
 */
abstract class Account
{
    public abstract void getUserType();
    public abstract void calculateInterest();
    public void findUser()
    {
        System.out.println("查找用户信息");
    }
    public void display()
    {
        System.out.println("显示用户信息");
    }
    public void handle()
    {
        findUser();
        display();
        getUserType();
        calculateInterest();

    }
}
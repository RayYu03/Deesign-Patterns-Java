package ch26;

/**
 * Created by RayYu on 2016/12/23.
 */
class CurrentAccount extends Account
{
    public void getUserType()
    {
        System.out.println("当前是活期用户");
    }
    public void calculateInterest()
    {
        System.out.println("活期用户利率");
    }
}

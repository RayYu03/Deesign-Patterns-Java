package ch26;

/**
 * Created by RayYu on 2016/12/23.
 */
class SavingAccount extends Account
{
    public void getUserType()
    {
        System.out.println("当前是定期用户");
    }
    public void calculateInterest()
    {
        System.out.println("定期用户利率");
    }
}

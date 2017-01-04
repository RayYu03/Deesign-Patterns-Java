package ch26;

/**
 * Created by RayYu on 2016/12/23.
 */
class Client
{
    public static void main(String args[])
    {
        Account account;
        account = new CurrentAccount();
        account.handle();
    }
}
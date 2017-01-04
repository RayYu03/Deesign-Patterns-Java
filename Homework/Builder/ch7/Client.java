package ch7;

/**
 * Created by RayYu on 2016/12/7.
 */
public class Client
{
    public static void main(String args[])
    {
        ComputerBulider cb = (ComputerBulider)XMLUtil.getBean();

        ComputerAssembleDirector cad =new ComputerAssembleDirector();

        cad.setComputerBulider(cb);

        Computer computer = cad.assemble();

        System.out.println("Computer 组成：");
        System.out.println(computer.getCpu());
        System.out.println(computer.getRam());
    }
}


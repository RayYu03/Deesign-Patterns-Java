package ch4.sample01;

public class TVFactory
{
	public static TV produceTV(String brand) throws Exception
	{
		if(brand.equalsIgnoreCase("Haier"))
		{
			System.out.println("Producing Haier TV...");
			return new HaierTV();
		}
		else if(brand.equalsIgnoreCase("Hisense"))
		{
			System.out.println("Producing Hisense TV...");
			return new HisenseTV();
		}
		else
		{
			throw new Exception("Sorry! Can not produce this TV.");
		}
	}
}
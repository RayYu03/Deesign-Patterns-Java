package ch25;

public class Kansa implements Cipher{

	public String doEncrypt(int key, String plainText)
	{

		System.out.println("执行"+plainText+"加密！");
		return Integer.toString(key+1);
	}


}
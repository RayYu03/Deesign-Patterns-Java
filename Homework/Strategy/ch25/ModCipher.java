package ch25;

public class ModCipher implements Cipher{

	public String doEncrypt(int key, String plainText)
	{
		System.out.println("执行"+plainText+"加密！");
		return Integer.toString(key/3);
	}


}



package ch25;

public class Client {

	public static void main(String[] args) {
		DataOperation dop1=new DataOperation(new Kansa());
		System.out.println(dop1.doEncrypt(9, "Kansa"));
		DataOperation dop2=new DataOperation(new ModCipher());
		System.out.println(dop2.doEncrypt(9, "ModCipher"));



	}

}
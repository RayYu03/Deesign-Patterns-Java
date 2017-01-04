package ch21;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WTO wto = new WTO();
		China cn = new China();
		America us = new America();
		cn.setUniteNations(wto);
		us.setUniteNations(wto);
		wto.setCn(cn);
		wto.setUs(us);
		cn.declare("我没什么要跟美国说的");
		us.declare("我有好多话想跟中国大哥说");
	}

}

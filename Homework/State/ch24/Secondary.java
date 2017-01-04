package ch24;

public class Secondary extends Role {
	public Secondary() {
		play();
		doubleScore();
	}

	public void changeRole() {
		if(jifen > 200){
			player.setRole(new Secondary());
			System.out.println("恭喜你升级为骨灰级选手");
		}
		else if(jifen < 100){
			player.setRole(new Primary());
			System.out.println("你降级为入门级选手");
		}
	}

	public void play(){
		System.out.println("你正在玩了");
	}

	public void doubleScore(){
		System.out.println("你可以使用双倍积分");

	}

	public void setJifen(int jifen) {
		this.jifen = jifen;
		changeRole();
	}

}
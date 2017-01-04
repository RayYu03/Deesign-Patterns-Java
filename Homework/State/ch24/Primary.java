package ch24;

public class Primary extends Role {
	public Primary() {
		play();
	}
	public void play(){
		System.out.println("你正在玩了");
	}
	public void changeRole() {
		if(jifen > 100){
			System.out.println("恭喜你升级为熟练级选手");
			Secondary secondary  = new Secondary();
			player.setRole(secondary);

		}
	}
	public void setJifen(int jifen) {
		this.jifen = jifen ;
		changeRole();
	}

}
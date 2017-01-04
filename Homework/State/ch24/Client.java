package ch24;

public class Client {

	public static void main(String[] args) {
		System.out.println("游戏开始");
		Player player = new Player(100, new Primary());
		System.out.println("赢得比赛");
		try {
			player.setJifen(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

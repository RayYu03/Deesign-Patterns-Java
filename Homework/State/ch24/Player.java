package ch24;

public class Player {
	private int jifen;
	private Role role;
	public Player(){};
	public Player(int jifen,Role role) {
		setRole(role);
	}
	public void setRole(Role role){
		this.role = role;
	}
	public void setJifen(int jifen){
		this.jifen = jifen;
		role.setJifen(jifen);
	}
	
}

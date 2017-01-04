package ch24;

public abstract class Role {
	protected int jifen;
	protected Player player = new Player();
	public abstract void changeRole();
	public abstract void setJifen(int jifen);
}

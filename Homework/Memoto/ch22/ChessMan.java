package ch22;

public class ChessMan {

	private String label;
	private int x;
	private int y;

	public ChessMan(String label, int x, int y) {
		super();
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ChessManMemento Save() {
		return new ChessManMemento(this.label, this.x, this.y);
	}

	public void restore(ChessManMemento memento) {
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
	}

}

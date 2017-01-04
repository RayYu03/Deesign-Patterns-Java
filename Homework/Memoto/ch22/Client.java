package ch22;

public class Client {

	private static int index = -1;
	private static MementoCaretaker mc = new MementoCaretaker();

	public static void play(ChessMan chess) {
		mc.setMementoList(chess.Save());
		index++;
		System.out.println("棋子" + chess.getLabel() + "现在在第" + chess.getX() + "行" + chess.getY() + "列");
	}

	public static void undo(ChessMan chess, int i) {
		System.out.println("我要悔棋了>>>>>>>>>>>");
		index--;
		chess.restore(mc.getMemento(i - 1));
		System.out.println("棋子" + chess.getLabel() + "现在在第" + chess.getX() + "行" + chess.getY() + "列");
	}

	public static void redo(ChessMan chess, int i) {
		System.out.println("我不悔棋了>>>>>>>>>>>");
		index++;
		chess.restore(mc.getMemento(i + 1));
		System.out.println("棋子" + chess.getLabel() + "现在在第" + chess.getX() + "行" + chess.getY() + "列");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessMan chess = new ChessMan("兵", 6, 4);

		play(chess);
		chess.setX(7);
		play(chess);
		chess.setY(5);
		play(chess);
		undo(chess, index);
		undo(chess, index);
		redo(chess, index);
		redo(chess, index);

	}

}

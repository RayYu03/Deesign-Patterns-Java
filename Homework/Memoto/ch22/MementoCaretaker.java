package ch22;

import java.util.ArrayList;

public class MementoCaretaker {

	private ArrayList mementoList = new ArrayList();

	public void setMementoList(ChessManMemento memento) {
		mementoList.add(memento);
	}

	public ChessManMemento getMemento(int i) {
		return (ChessManMemento) mementoList.get(i);
	}
}

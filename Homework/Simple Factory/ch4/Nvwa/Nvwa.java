package ch4.Nvwa;

public class Nvwa {

	public static void makePerson(String p){
		Person person = PersonFactory.produceperson(p);
		person.diffOperation();
	}

	public static void main(String[] args) {
        makePerson("M");
		makePerson("W");
        makePerson("R");
	}
}

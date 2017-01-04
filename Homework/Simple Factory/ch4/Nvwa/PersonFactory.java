package ch4.Nvwa;

public class PersonFactory {
	public static Person produceperson(String p){
		if(p == "W"){
			return (new Woman());
		}
		else if(p == "M"){
			return (new Man());
		}
		else if(p == "R"){
			return (new Robot());
		}
		return null;
	}
}

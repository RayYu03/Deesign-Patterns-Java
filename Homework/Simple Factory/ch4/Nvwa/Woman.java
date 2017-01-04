package ch4.Nvwa;

public class Woman implements Person{

	public Woman(){
		System.out.println("创建了一个女人...");
	}

	@Override
	public void diffOperation() {
		System.out.println("我爱跳舞...");
	}

}

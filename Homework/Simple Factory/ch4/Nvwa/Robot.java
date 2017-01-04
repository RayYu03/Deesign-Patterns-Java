package ch4.Nvwa;

public class Robot implements Person {

	public Robot(){
		System.out.println("创建了一个机器人...");
	}

	@Override
	public void diffOperation() {
		System.out.println("我爱打柳爽...");
	}
}

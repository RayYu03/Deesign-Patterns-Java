package ch21;

public class WTO extends UnitedNations {

	private China cn;

	public China getCn() {
		return cn;
	}

	public void setCn(China cn) {
		this.cn = cn;
	}

	public America getUs() {
		return us;
	}

	public void setUs(America us) {
		this.us = us;
	}

	private America us;

	@Override
	public void declare(String message, Country country) {
		// TODO Auto-generated method stub

		if (country == cn) {
			us.getMessage(message);
		} else {
			cn.getMessage(message);
		}

	}

}

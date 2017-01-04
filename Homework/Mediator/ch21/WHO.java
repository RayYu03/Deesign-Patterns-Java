package ch21;

public class WHO extends UnitedNations {

	private America us;
	public America getUs() {
		return us;
	}
	public void setUs(America us) {
		this.us = us;
	}
	private China cn;

	public China getCn() {
		return cn;
	}

	public void setCn(China cn) {
		this.cn = cn;
	}

	@Override
	public void declare(String message, Country country) {
		// TODO Auto-generated method stub

		if (country == us) {
			cn.getMessage(message);
		} else {
			us.getMessage(message);
		}
	}

}

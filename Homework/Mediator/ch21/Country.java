package ch21;

public abstract class Country {

	protected UnitedNations un;

	public void setUniteNations(UnitedNations un) {
		this.un = un;
	}

	public void declare(String message) {
		un.declare(message, this);
	}

	public abstract void getMessage(String message);
}

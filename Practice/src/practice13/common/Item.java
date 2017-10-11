package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;

	// getter
	public String getName() {
		return this.name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// getter
	public int getadditionalDamage() {
		return this.additionalDamage;
	}

	// setter
	public void setadditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}

}

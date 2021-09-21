package FWC;

public abstract class WheelChair {
	String name;

	Racing racing;
	Offroad offroad;
	Medical medical[];
	Daily daily;
	Electric electric;

	abstract void prepare();

	void outpatient() {
		System.out.println("At service Out Patient");
	}

	void inpatient() {
		System.out.println("At service In Patient");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (racing != null) {
			result.append(racing);
			result.append("\n");
		}
		if (offroad != null) {
			result.append(offroad);
			result.append("\n");
		}
		if (daily != null) {
			result.append(daily);
			result.append("\n");
		}
		if (medical != null) {
			for (int i = 0; i < medical.length; i++) {
				result.append(medical[i]);
				if (i < medical.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (electric != null) {
			result.append(electric);
			result.append("\n");
		}
		return result.toString();
	}
}
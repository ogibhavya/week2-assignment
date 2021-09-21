package FWC;

public class MyWheelChairIngredientFactory
		implements WheelChairIngredientFactory
{
	
	public Racing createRacing() {
		return new EmergencyRacing();
	}

	public Offroad createOffroad() {
		return new RestOffroad();
	}

	public Medical[] createMedical() {
		Medical medical[] = { new Selfuse(),
							new Pharmacy(),
							new Treatment() };

		return medical;
	}

	public Daily createDaily() {
		return new UseDaily();
	}

	public Electric createElectric() {
		return new TypeElectric();
	}
}

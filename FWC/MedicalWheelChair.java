package FWC;

public class MedicalWheelChair extends WheelChair {
	WheelChairIngredientFactory ingredientFactory;
 
	public MedicalWheelChair(WheelChairIngredientFactory ingradientFactory, WheelChairIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("listening " + name);
		racing = ingredientFactory.createRacing();
		offroad = ingredientFactory.createOffroad();
		medical = ingredientFactory.createMedical();
		daily = ingredientFactory.createDaily();
		electric = ingredientFactory.createElectric();
	}
}

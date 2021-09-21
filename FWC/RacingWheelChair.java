package FWC;

public class RacingWheelChair extends WheelChair {
	WheelChairIngredientFactory ingredientFactory;
 
	public RacingWheelChair(WheelChairIngredientFactory ingradientFactory, WheelChairIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("listening " + name);
		offroad = ingredientFactory.createOffroad();
		medical = ingredientFactory.createMedical();
		daily = ingredientFactory.createDaily();
		electric = ingredientFactory.createElectric();
	}
}
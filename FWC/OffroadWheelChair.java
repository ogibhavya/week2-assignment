package FWC;

public class OffroadWheelChair extends WheelChair {
	WheelChairIngredientFactory ingredientFactory;
 
	public OffroadWheelChair(WheelChairIngredientFactory ingradientFactory, WheelChairIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("listening " + name);
		racing = ingredientFactory.createRacing();
		medical = ingredientFactory.createMedical();
		daily = ingredientFactory.createDaily();
		electric = ingredientFactory.createElectric();
	}
}
package FWC;

public class DailyWheelChair extends WheelChair {
	WheelChairIngredientFactory ingredientFactory;
 
	public DailyWheelChair(WheelChairIngredientFactory ingradientFactory, WheelChairIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("listening " + name);
		racing = ingredientFactory.createRacing();
		offroad = ingredientFactory.createOffroad();
		medical = ingredientFactory.createMedical();
		electric = ingredientFactory.createElectric();
	}
}
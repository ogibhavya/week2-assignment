package FWC;

public class MyWheelChairStore extends WheelChairStore {

	protected WheelChair createWheelChair(String item) {
		WheelChair wheelchair = null;
		WheelChairIngredientFactory ingredientFactory =
		new MyWheelChairIngredientFactory();

		if (item.equals("racing")) {

			wheelchair = new RacingWheelChair(ingredientFactory, ingredientFactory);
			wheelchair.setName("MyWheelChair Design Racing WheelChair");

		} else if (item.equals("offroad")) {

			wheelchair = new OffroadWheelChair(ingredientFactory, ingredientFactory);
			wheelchair.setName("MyWheelChair Design Offroad WheelChair");

		} else if (item.equals("Medical")) {

			wheelchair = new MedicalWheelChair(ingredientFactory, ingredientFactory);
			wheelchair.setName("MyWheelChair Design Medical WheelChair");

		} else if (item.equals("daily")) {

			wheelchair = new DailyWheelChair(ingredientFactory, ingredientFactory);
			wheelchair.setName("MyWheelChair Design Daily WheelChair");

		} else if (item.equals("electric")) {
	
			wheelchair = new ElectricWheelChair(ingredientFactory, ingredientFactory);
			wheelchair.setName("MyWheelChair Design Electric WheelChair");
	
		}
		return wheelchair;
	}
}
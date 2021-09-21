package FWC;

public abstract class MyWheelChair {
 
	protected abstract WheelChair createWheelChair(String item);
 
	public WheelChair orderWheelChair(String type) {
		WheelChair wheelchair = createWheelChair(type);
		System.out.println("--- getting ready " + wheelchair.getName() + " ---");
		wheelchair.inpatient();
		wheelchair.outpatient();
		return wheelchair;
	}
}
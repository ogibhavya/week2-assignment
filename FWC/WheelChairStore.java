package FWC;

public abstract class WheelChairStore {
 
	protected abstract WheelChair createWheelChair(String item);
 
	public WheelChair orderWheelChair(String type) {
		WheelChair wheelchair = createWheelChair(type);
		System.out.println("--- is getting ready " + wheelchair.getName() + " ---");
		wheelchair.prepare();
		wheelchair.outpatient();
		wheelchair.inpatient();
		return wheelchair;
	}
}
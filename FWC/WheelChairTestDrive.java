package FWC;

public class WheelChairTestDrive {
 
	public static void main(String[] args) {
		WheelChairStore myStore = new MyWheelChairStore();

		WheelChair wheelchair = myStore.orderWheelChair("daily");
		System.out.println("1Shun ordered a " + wheelchair + "\n");

		wheelchair = myStore.orderWheelChair("offroad");
		System.out.println("2Shun ordered a " + wheelchair + "\n");

		wheelchair = myStore.orderWheelChair("racing");
		System.out.println("3Shun ordered a " + wheelchair + "\n");
		
		wheelchair = myStore.orderWheelChair("electric");
		System.out.println("5Shun ordered a " + wheelchair + "\n");

		wheelchair = myStore.orderWheelChair("medical");
		System.out.println("4Shun ordered a " + wheelchair + "\n");
		


	}
}
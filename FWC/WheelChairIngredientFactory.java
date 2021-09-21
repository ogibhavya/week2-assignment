package FWC;

public interface WheelChairIngredientFactory {
 
	public Daily createDaily();
	public Offroad createOffroad();
	public Racing createRacing();
	public Medical[] createMedical();
	public Electric createElectric();
 
}
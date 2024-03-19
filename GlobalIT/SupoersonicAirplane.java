package exampleInherit4;

public class SupoersonicAirplane extends Airplane{
	//field
	public static final int NORMAL = 1;
	public static final int SUPER_SONIC = 2;
	public int flyMode = NORMAL;
	
	//method
	@Override
	void land() {
		System.out.println("SSA land");
	}
	@Override
	void  fly() {
		if (flyMode == SUPER_SONIC) {
			System.out.println("SSA fly");
		} else {
			super.fly();
		}
	}
	
	@Override
	void takeoff() {
		System.out.println("SSA takeoff");
	}
	
	void changeFlyMode() {
		if (flyMode == NORMAL) {
			flyMode = SUPER_SONIC;
		} else {
			flyMode = NORMAL;
		}
	}
}

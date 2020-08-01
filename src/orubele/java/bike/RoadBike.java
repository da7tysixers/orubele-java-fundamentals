package orubele.java.bike;

public class RoadBike implements Bicycle{

	@Override
	public void speed(int speed) {
		System.out.println("this is not a running bike" + speed);
		
	}

	@Override
	public void gear(int gear) {
		System.out.println("The gear to this bike is " + gear);
	}

	@Override
	public void paddleBreak(int paddlebreak) {
		System.out.println("bike is out of service");
		
	}
	
	

}

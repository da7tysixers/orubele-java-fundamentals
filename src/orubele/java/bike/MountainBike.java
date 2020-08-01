package orubele.java.bike;

public class MountainBike implements Bicycle {
	private int speed;
	private int gear;
	private int paddlestop;

	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	public int getPaddlestop() {
		return paddlestop;
	}

	@Override
	public void speed(int speed) {
		this.speed = speed;
	}

	@Override
	public void gear(int gear) {
		this.gear = gear;
		
	}

	@Override
	public void paddleBreak(int paddlebreak) {
		this.paddlestop = paddlebreak;
		
	}

}

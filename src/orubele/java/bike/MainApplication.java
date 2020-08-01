package orubele.java.bike;

public class MainApplication {
	public static void main(String[] args) {
		
	
	MountainBike mountainBicycle = new MountainBike();
	
	mountainBicycle.gear(5);
	System.out.println(mountainBicycle.getGear());
	
	}

}

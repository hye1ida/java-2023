package s0612;

public class TruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
		truck.carmane = "프론티어";
		truck.color = "파랑";
		truck.ton = 5;
		truck.speedUp();
		System.out.println(truck.carmane + "은 "+truck.color+"색이고 "+truck.ton+"톤이다.");
	}

}

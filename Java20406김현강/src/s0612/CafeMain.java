package s0612;
import s0612.Cafe;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cafe c = new Cafe();
		c.makeTea(5);
		c.makeTea(2, 3);
		c.makeTea(4, 5, 10);
		c.printCount();
		
		Cafe c2 = new Cafe();
		c2.makeTea(5);
		c2.makeTea(1, 2);
		c2.makeTea(3, 4, 2);
		c2.printCount();
	}

}

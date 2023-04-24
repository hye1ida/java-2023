package s0417;

public class 학생메인 {

	public static void main(String[] args) {
		학생 hong = new 학생();
		학생 kim = new 학생();
		학생 KIM = new 학생("김현강",18,2,46,60);
		KIM.printAll();
		
		hong.age = 100;
		hong.grade = 3;
		hong.name = "홍길동";
		hong.number = 25;
		hong.printAll();
		
		kim.age = 18;
		kim.grade = 2;
		kim.name = "김동현";
		kim.number = 3;
		kim.printAll();
	}

}

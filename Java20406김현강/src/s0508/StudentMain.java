package s0508;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		Student.SchoolName = "서울로봇고";
		System.out.println(kim.SchoolName + "학생 객체수: " + Student.count);
		
		Student kang = new Student();
		System.out.println(kang.SchoolName + "학생 객체수: " + Student.count);
		
		Student bak = new Student();
		System.out.println(bak.SchoolName + "학생 객체수: " + Student.count);
		
		System.out.println(Student.PI);
	}

}

package s0508;

public class GetSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student 클래스의 name, grade를 수정한다.
		
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("김현강");
		kim.setGrade(3);
		kim.setScore(90);
		System.out.println(kim.getName()+"는 "+kim.getGrade() +"학년 "+kim.getScore()+"점 입니다.");
		
		
		Student hye = new Student();
		hye.setName("강혜원");
		hye.setGrade(2);
		hye.setScore(100);
		hye.printALL();
	}

}

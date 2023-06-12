package s0612;

public class Leader extends Student{
	boolean lead;
	
	Leader(boolean lead) {
		this.lead = lead;
	}
	Leader(String name, String hakbun, boolean lead){
		super(name, hakbun);
		this.lead = lead;
	}
	
	void isLeader(){
		if(lead == true)
			System.out.println(name + " 학급회장");
		else
			System.out.println(name + " 학급회장이 아니다.");
	}
}

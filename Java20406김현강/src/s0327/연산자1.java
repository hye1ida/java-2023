package s0327;

import java.util.Scanner;

public class 연산자1 {

	public static void main(String[] args) {
		
		Scanner 입력기 = new Scanner(System.in);
		int a;
		System.out.print("숫자입력 : ");
		a = 입력기.nextInt();
		
		if (a % 2 == 0)
			System.out.printf("%d는 짝수입니다.",a);
		else
			System.out.printf("%d는 홀수입니다.",a);
		
	}

}

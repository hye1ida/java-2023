package s0403;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("수입력 : ");
		a = sc.nextInt();
		
		switch (a % 3) {
		case 0:
			System.out.printf("%d은(는) 3의 배수입니다.\n",(a));
			break;
		default:
			System.out.println(a + "은(는) 3의 배수가 아닙니다.");
			break;
		}
	}

}

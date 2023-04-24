package s0327;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		char op;
		System.out.print("a입력 : ");
		a = sc.nextInt();
		System.out.print("b입력 : ");
		b = sc.nextInt();
		System.out.println("연산자 입력 : ");
		op = sc.next().charAt(0);
		
		if (op == '+')
			System.out.printf("%d+%d=%d",a,b,a+b);
		else if (op == '-')
			System.out.printf("%d-%d=%d",a,b,a-b);
		else if (op == '*')
			System.out.printf("%d*%d=%d",a,b,a*b);
		else if (op == '/')
			System.out.printf("%d/%d=%d",a,b,a/b);
		else 
			System.out.println("사칙연산자가 아닙니다.");
	}
}
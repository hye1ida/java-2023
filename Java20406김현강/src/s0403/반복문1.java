package s0403;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		int N;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		N = sc.nextInt();

		for(int i = 1;i<=N;i++)
			if (i % 2 == 0) {
				sum -= i;
				System.out.print("-"+i);}
			else {
				sum += i;
				System.out.print("+"+i);}
		System.out.print("="+sum);
	}

}

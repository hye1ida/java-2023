package s0403;

import java.util.Scanner;

public class 반복문3 {

	public static void main(String[] args) {
		
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int N = sc.nextInt();
		
		while(true) {
			if(i <= N) 
				if(i % 3 == 0) {
					i++;
					continue;
				}
				else {
					System.out.println(i);
					i++;
				}
			else 
				break;		
		} 

	}

}

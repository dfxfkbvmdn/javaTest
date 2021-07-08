package kr.co.job.oper;

public class ForTest06 {

	public static void main(String[] args) {
		System.out.println("======줄칸 또는 행열에 대하여  =======");
		for(int i=1; i<=4; i++) {// i : 줄
			
			for(int j=1; j<=i; j++) {  // j : 별의 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 난수 발생 : Math.random() - 0~0.9999의 임의의 수를 하나를 발생시킴
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num =0;
		num = (int)(Math.random()*10);  // 0 ~ 9
		System.out.println(num);
		
		// 1~ 10사이의 수 발생
		num = (int)(Math.random()*10) + 1;
		System.out.println(num);
		
		//1~45사이의 수 발생
		num = (int)(Math.random()*45) + 1;
		System.out.println(num);
		
		//11~13사이의 수 발생
		for(int i=1; i<=10; i++) {
			num = (int)(Math.random() * 3) + 11;//(int)(Math.random() * X) + Y;
			System.out.println(num);
		}
		
		

	}

}

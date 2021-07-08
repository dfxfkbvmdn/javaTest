package kr.co.job.exec;

public class ChapThree {

	public static void main(String[] args) {
//		3-10 문제
//		char ch = 'A';
//		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
//				
//		3-9 문제
//		char ch = 'z';
//		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0'<= ch && ch <= '9');
//		97 <= ch && ch <= 120 
//		System.out.println(b);
//		
//		3-8문제
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b);
//		char ch = 'A';
//		ch = (char)(ch + 2);
//		float f = 3 / 2f;
//		long l = 3000 * 3000 * 3000L;
//		float f2 = 0.1f;
//		double d = 0.1;
//		boolean result = (float)d==f2;
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		
//		3-7 문제 - 변환 결과값은 소수점	셋째자리에서 반올림해야한다
//		int fahrenheit = 100;
//		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
		
//		3-6 문제
//		아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//		다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
//		[Hint] 나머지 연산자를 사용하라.
//		int num = 24;
//		System.out.println(10 - num%10);
		
//		3-5문제 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다
//		int num = 333;
//		System.out.println(num/10*10+1);
		
//		3-4문제 num의 값 중에서 백의 자리 이하를 버리는 코드이다
//		int num = 456;
//		System.out.println(num/100*100);
		
//		3-3문제
//		int num = 10;
//		System.out.println(num > 0 ? "양수":(num < 0 ? "음수" : "0"));
		
//		3-2 문제
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ;
//		System.out.println("필요한 바구니의 수 :"+numOfBucket);
//		
		//3_1 문제
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		//                 y = y + 10 - x++;  
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);			

	}

}

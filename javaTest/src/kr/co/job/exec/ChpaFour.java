package kr.co.job.exec;

public class ChpaFour {

	public static void main(String[] args) {
//      4-15문제 회문수 : 역순도 같습니다.
		int number =12321;
		String str = null;
		String str2 = "";
//		boolean isOk = true;  // ok 넌 회문수야
		// number => 문자열로 변경한다.str
		str = Integer.toString(number);
		
		// 변경한 문자열을 역순으로 저장(대입)한다. str2
		for(int i =str.length()-1;i>=0; i--) {
			str2 += str.charAt(i);
		}
		
		if (str.equals(str2)) {
			System.out.println(number+" 는 회문수입니다");
		} else {
			System.out.println(number+" 는 회문수가 아닙니다");
		}
		
		
		//4-14문제
//		컴퓨터가 숫자를 하나 가지고 있음 -> 나는맞춘다.
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1 과 100사이의 값을 입력하세요"); //
//			input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//			
//			if(input > answer) {// input이 더 크다
//				System.out.println("더 작은수를 입력하세요");
//			}else if(input<answer) {  // input이 작다
//				System.out.println("더 큰수를 입력하세요");
//			}else {
//				System.out.println("맞췄습니다. \n시도횟수는");
//				System.out.println(count + "입니다.");
//				break;
//			}
//			
//		}while(true);
		
		//4-13문제
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		// charAt(int i) 반복문과 를 이용해서 문자열의 문자를
//		// . 하나씩 읽어서 검사한다
//		for(int i=0; i < value.length() ;i++) {
//			
//			
//		}
//		if (isNumber) {
//			System.out.println(value+" 는 숫자입니다");
//		} else {
//			System.out.println(value+" 는 숫자가 아닙니다");
//		}

		//4-11 문제 1,1,2,3,5,8,13,21, => 피보나치 수열
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//		System.out.print(num1+","+num2);
//		for (int i = 0 ; i < 8 ; i++ ) {
//			num3 = num1 + num2; // . 세번째 값은 첫번째와 두번째 값을 더해서 얻는다
//			System.out.print(","+num3); // 세 번째 수열 출력
//			num1 = num2; // . 두 번째 수열을 첫 번째 값으로 한다
//			num2 = num3; // . 세 번째 수열을 두 번째 값으로 한다
//		}
//		4-9문제, 4-10문제
//		문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력
//		숫자 12345   -> 각 자리수의 합
//		int num = 12345, temp=0;// temp에 num을넣음 
//		int sum = 0;
//		
//		temp = num;
//		while(temp>0) {
//			sum = sum + temp%10;
//			temp = temp/10;
//		}
//		System.out.println("num = "+num+" 일때 sum = " + sum);
		
//		String str = "12345";  //str.charAt(idx)  -> char
//		int sum =0;
//		for(int i=0;i<str.length();i++) {
//			sum = sum + str.charAt(i)-48;//str.charAt(i)-'0'
//		}
//		System.out.println("sum = " + sum);

//		4-8문제
//		2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//				0<=x<=10, 0<=y<=10
//		for(int x=0;x<=10;x++) {
//			for(int y=0;y<=10;y++) {
//				if(2*x+4*y==10) {
//					System.out.println(x +", "+y);
//				}
//			}
//		}
		
		
//		4-6문제
//		두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
//		int dice1 =0, dice2=0, sum=0;
//		int diceSize=6, result =6;// 주사위의 눈의 개수, 구하고자하는 합
//		
//		for(dice1=1; dice1<=diceSize; dice1++) { //주사위1이 1부터 6까지
//			for(dice2=1;dice2<=diceSize;dice2++) {   // 주사위2가 1부터 6까지
//				sum = dice1 + dice2;
//				if(sum == result) {
//					System.out.println(dice1 + " , "+dice2);
//				}
//				
//			}
//		}
		
//		4-4문제
//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야
//		총합이 100이상이 되는지 구하시오.
//		int i=0, sum=0;
//		while(sum<100) {
//			i++;
//			if(i%2==1) {// i가 홀수라면 +
//				sum += i;
//			}
//			else {    // i가 짝수라면 -
//				sum -= i;
//			}
//		}
//		System.out.println("i="+i +"  sum= "+ sum);
//		for(i=1;true;i++) {
//			sum = sum + i *(s*(-1));
//			if(sum>100)
//				break;
//		}
//		System.out.println(i);
		
//		4-3 문제 
//		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과
//		int sum=0, totalSum=0;
//		
//		for(int i=1; i<=9; i++) {
//			sum += i;
//			totalSum += sum;			
//		}
		
		
		
		
		
//		1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
//		!(i%2==0 || i%3==0)  => (i%2 !=0 && i%3 !=0)
//		int sum=0;		
//		for(int i=1;i<=20;i++) {
//			if(i%2 !=0 && i%3 !=0) {
//				sum = sum + i;
//				sum += i;
//			}
//		}
		
		//4-1  이상,이하(=)
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 10<x<20
//		10<x && x<20   => x>10 && x<20

//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		!(ch == ' ' || ch =='\t') `
		
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//		ch == 'x' || ch == 'X'
		
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		'0' <= ch && ch <='9'
		
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
		
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
//		나눠떨어지지 않을 때 true인 조건식
//		year%400==0 || year%4==0 && year%100!=0
		
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		!powerOn 또는 powerOn==false
		
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
//		 str == "yes"
//		str.equals("yes") 또는 "yes".equals(str)
		

	}

}

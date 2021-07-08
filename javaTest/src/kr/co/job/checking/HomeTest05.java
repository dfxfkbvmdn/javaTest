package kr.co.job.checking;

import java.util.Scanner;

public class HomeTest05 {

   public static void main(String[] args) {
      //선언
      Scanner scan = new Scanner(System.in);
      int num=0; //메뉴 선택 
      int price=0,pay=0,drink=0; //금액,금액 저장소,음료선택
      boolean done =true;
      
      String[] drinkName= new String[3];
      drinkName[0]="아메리카노";
      drinkName[1]="사이다";
      drinkName[2]="콜라";
      
      int[] drinkPrice= new int[3];
      drinkPrice[0]=500;
      drinkPrice[1]=500;
      drinkPrice[2]=1000;
      
      int[] drinkGa= new int[3];
      drinkGa[0]=5;
      drinkGa[1]=5;
      drinkGa[2]=5;
      
      while(done) {
         System.out.println("-----------------");
         System.out.println("잔액: "+pay);
         System.out.println("-------메뉴-------");
         System.out.println("1.동전넣기 2.음료 3.동전반환 4.종료");
         System.out.println("-----------------");
         num = scan.nextInt();
         
      switch(num) {
      
      case 1:
         System.out.println("동전을 넣어주세요.");
         price = scan.nextInt();
         System.out.println(price+"원 받았습니다.");
         pay=pay+price;
         
         break;
         
      case 2:
         System.out.println("음료를 선택해주세요.");
         System.out.println("1.아메리카노 "+drinkPrice[0]+"원"+" 2.사이다 "+drinkPrice[1]+"원"+" 3.콜라 "+drinkPrice[2]+"원");
         drink = scan.nextInt();
//         drinkGa[drink-1]=drinkGa[drink-1]-1;
//         pay=pay-drinkPrice[drink-1];  여기 삭제
         
         switch(drink) {
         	case 1:	         
         	case 2:	         
         	case 3:
	        	 if(pay>=drinkPrice[drink-1]) {
	        		 System.out.println(drinkName[drink-1]+"가 선택되었습니다.");
	        		 drinkGa[drink-1]=drinkGa[drink-1]-1;
	        		 pay=pay-drinkPrice[drink-1];
	        		 System.out.println("남은재고는 "+drinkGa[drink-1]+"개 입니다.");
	        	 }
	        	 else {
	        		 System.out.println("잔액이 부족합니다.");
	        	 }
	         
	      default:
	        	 System.out.println("번호를 잘못누르셨습니다.");        
	        	 break;
         
         }// end of switch(drink)
         
      case 3:
         System.out.println("잔액 "+pay+"을 반환합니다.");
         pay=0;
         break;
         
      case 4:
         System.out.println("종료합니다.");
         done = false;
         break;
         
      default :
      
      }         
   }

   }

}
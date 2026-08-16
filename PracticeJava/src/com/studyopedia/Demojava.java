package com.studyopedia;

import java.util.Scanner;
class Demojava{
	public static void main(String[] arg){
		Scanner sc =new Scanner(System.in);
		int Num=(int)(Math.random()*100);
		int num;
		do {
			System.out.print("Enter a number(1-100): ");
			num = sc.nextInt();
			if (num > Num)
				System.out.println("The Number is heighter than expected.");
			else if (num <Num)
				System.out.println("The Number if Lower tha Expected.");
			else {
				System.out.println("Yes , WOOHOO THAT'S THE NUMBER");
				break;}
		}while(num >=0);
		
		System.out.println("My Number Was: "+num);
	}
}
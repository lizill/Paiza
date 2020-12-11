package RankD;

import java.util.Scanner;

public class RankD {

	public static void main(String[] args) {
//		ichimanPo();
//		nKakuKata();
//		printString();
//		underLine();
		plus();
	}
	
	public static void plus() {
		Scanner input = new Scanner(System.in);
		
		int v1 = input.nextInt();
		String plus = input.next();
		int v2 = input.nextInt();
		
		System.out.println(v1+v2);
		
		input.close();
	}
	
	public static void underLine() {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.nextLine();
		System.out.println(str1);
		
		for(int i=0; i<str1.length(); i++) {
			System.out.print("^");
		}
		
		input.close();
	}
	
	public static void printString() {
		  Scanner input = new Scanner(System.in);
		  
	      String str1 = input.nextLine();
	      
	      for(int i=0; i<str1.length()-8; i++) {
	          System.out.print(str1.charAt(i));
	      }
	      System.out.println("!!");
	      
	      input.close();
	}
	
	public static void nKakuKata() {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int naikaku = 180*(n-2)/n;
		
		System.out.println(naikaku);
		
		input.close();
	}
	
	public static void ichimanPo() {
		Scanner input = new Scanner(System.in);
		int d = input.nextInt();
		int s = input.nextInt();
		int po = d*100000/s;
		
		if(po >= 10000) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		input.close();
	}
}

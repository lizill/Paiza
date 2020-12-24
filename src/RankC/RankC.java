package RankC;

import java.util.Scanner;

public class RankC {

	public static void main(String[] args) {

//		kakomu();
//		handoruname();
//		leet();
//		numbersRule();
		pointPay();
	}
	
	private static void pointPay() {
		Scanner input = new Scanner(System.in);
		
		int money = input.nextInt();
		int count = input.nextInt();
		int[] pay = new int[count];
		for(int i=0; i<count; i++) {
			pay[i] = input.nextInt();
		}
		
		int point = 0;
		for(int i=0; i<count; i++) {
			if(point>=pay[i]) {
				point -= pay[i];
			} else {
				money -= pay[i];
				point += pay[i]/10;
			}
			
			System.out.println(money + " " + point);
		}
		
		input.close();
	}
	
	private static void numbersRule() {
		Scanner input = new Scanner(System.in);
		
		String n = input.next();
		String backN = backStr(n);
		int sum = Integer.parseInt(n) + Integer.parseInt(backN);
		
		while(true) {
			if(checkNum(sum)) {
				System.out.println(sum);
				break;
			} else {
				n = Integer.toString(sum);
				backN = backStr(n);
				sum = Integer.parseInt(n) + Integer.parseInt(backN);
			}
		}

	}
	
	private static boolean checkNum(int sum) {
		String sumStr = Integer.toString(sum);
		
		for(int i=0; i<=sumStr.length()/2-1; i++) {
			if(sumStr.charAt(i)!=sumStr.charAt(sumStr.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static String backStr(String originStr) {
		String backStr = "";
		
		for(int i=originStr.length()-1; i>=0; i--) {
			backStr += originStr.charAt(i);
		}
		
		return backStr;
	}
	
	private static void leet() {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		String leet = "";
		
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A' :
					leet += "4";
					break;
				case 'E' :
					leet += "3";
					break;
				case 'G' :
					leet += "6";
					break;
				case 'I' :
					leet += "1";
					break;
				case 'O' :
					leet += "0";
					break;
				case 'S' :
					leet += "5";
					break;
				case 'Z' :
					leet += "2";
					break;
				default :
					leet += str.charAt(i);
			}
		}
		
		System.out.println(leet);
	}
	
	private static void handoruname() {
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		String handoruName = "";
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				continue;
			} else if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U') {
				continue;
			}
			handoruName += name.charAt(i);
		}
		
		System.out.println(handoruName);
	}
	
	private static void kakomu() {
		Scanner input = new Scanner(System.in);	
		
		String str = input.next();
		String waku = "++";
		
		for (int i=0; i<str.length(); i++) {
			waku += "+";
		}
		
		System.out.println(waku);
		System.out.println("+" + str + "+");
		System.out.println(waku);
		
	}

}

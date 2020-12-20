package RankC;

import java.util.Scanner;

public class RankC {

	public static void main(String[] args) {

//		kakomu();
//		handoruname();
		leet();
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

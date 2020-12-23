package RankB;

import java.util.Scanner;

public class ChangePlural {

	private static Scanner input = new Scanner(System.in);
	private static final int N = input.nextInt();
	
	public static void main(String[] args) {
		String[] str = new String[N];
		
		for(int i=0; i<N; i++) {
			str[i] = input.next();
			
			if(checkES(str[i])) {
				System.out.println(str[i] + "es");
			} else if(checkVES(str[i])) {
				System.out.println(remakeVES(str[i]));
			} else if(checkIES(str[i])) {
				System.out.println(remakeIES(str[i]));
			} else {
				System.out.println(str[i] + "s");
			}
		}
		
	}
	
	private static boolean checkES(String str) {
		int l = str.length();
		if(str.charAt(l-1)=='s' || str.charAt(l-1)=='o' || str.charAt(l-1)=='x') {
			return true;
		} else if(str.charAt(l-1)=='h' && (str.charAt(l-2)=='s' || str.charAt(l-2)=='c')) {
			return true;
		}
		return false;
	}
	
	private static boolean checkVES(String str) {
		int l = str.length();
		if(str.charAt(l-1)=='f') return true;
		else if (str.charAt(l-1)=='e' && str.charAt(l-2)=='f') return true;
		return false;
	}
	
	private static String remakeVES(String str) {
		String remakeStr = "";
		int l = str.length();
		if(str.charAt(l-1)=='f') {
			for(int i=0; i<l-1; i++) {
				remakeStr += str.charAt(i);
			}
			remakeStr += "ves";
			return remakeStr;
		} else {
			for(int i=0; i<l-2; i++) {
				remakeStr += str.charAt(i);
			}
			remakeStr += "ves";
			return remakeStr;
		}
	}

	private static boolean checkIES(String str) {
		int l = str.length();
		if(str.charAt(l-1)=='y') {
			if(!(str.charAt(l-2)=='a' || str.charAt(l-2)=='e' || str.charAt(l-2)=='i' || str.charAt(l-2)=='o' || str.charAt(l-2)=='u')) {
				return true;
			}
		}
		return false;
	}
	
	private static String remakeIES(String str) {
		String remakeStr = "";
		int l = str.length();
		
		for(int i=0; i<l-1; i++) {
			remakeStr += str.charAt(i);
		}
		remakeStr += "ies";
		return remakeStr;
	}
}

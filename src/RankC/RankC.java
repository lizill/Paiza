package RankC;

import java.util.Arrays;
import java.util.Scanner;

public class RankC {

	public static void main(String[] args) {
//		kakomu();
//		handoruname();
//		leet();
//		numbersRule();
//		pointPay();
//		perfectNumber();
//		miniComputer();
//		scoring();
//		cardArrangement();
//		logFilter();
//		numericSurvey();
//		leftGoods();
//		elevator();
//		ancientMath();
//		highAndDraw();
		stormZone();
	}
	
	private static void stormZone() {
		Scanner input = new Scanner(System.in);
		
		int xc = input.nextInt();
		int yc = input.nextInt();
		int r1 = input.nextInt();
		int r2 = input.nextInt();
		String st = "";
		
		int count = input.nextInt();
		for(int i=0; i<count; i++) {
			int locationX = input.nextInt();
			int locationY = input.nextInt();
			
			int location = (locationX-xc)*(locationX-xc) + (locationY-yc)*(locationY-yc);
			if(location >= r1*r1 && location <= r2*r2) st = "yes";
			else st = "no";
			
			System.out.println(st);
		}
		
		input.close();
	}
	
	private static void highAndDraw() {
		Scanner input = new Scanner(System.in);
		
		String result = "";
		
		final int PARENT_A = input.nextInt();
		final int PARENT_B = input.nextInt();
		
		int index = input.nextInt();
		for(int i=0; i<index; i++) {
			
			int childA = input.nextInt();
			int childB = input.nextInt();
			
			if(childA == PARENT_A) {
				if(childB>PARENT_B) {
					result = "High";
				} else {
					result = "Low";
				}
			} else {
				if(childA>PARENT_A) {
					result = "Low";
				} else {
					result = "High";
				}
			}
			
			System.out.println(result);
		}
		
		input.close();
	}
	
	private static void ancientMath() {
		Scanner input = new Scanner(System.in);
		
		String anciM = input.next();
		int sum = 0;
		
		for(int i=0; i<anciM.length(); i++) {
			switch(anciM.charAt(i)) {
			case '/' :
				sum += 1;
				break;
			case '<' :
				sum += 10;
				break;
			default :
			}
		}
		
		System.out.println(sum);
		input.close();
	}
	
	private static void elevator() {
		Scanner input = new Scanner(System.in);
		
		int index = input.nextInt();
		int floor[] = new int[index];
		int sum = 0;
		int currentFloor = 1;
		
		for(int i=0; i<floor.length; i++) {
			floor[i] = input.nextInt();
			int dif = currentFloor - floor[i];
			if(dif < 0) 
				dif *= -1;
			sum += dif;
			currentFloor = floor[i];
		}
		
		System.out.println(sum);
		input.close();
	}
	
	private static void leftGoods() {
		Scanner input = new Scanner(System.in);
		
		double m = input.nextInt();
		double p = input.nextInt();
		double q = input.nextInt();
		
		double kakou = m - m*(p/100);
		double result = kakou - kakou*(q/100);
		
		System.out.println(result);
		
		input.close();
	}
	
	private static void numericSurvey() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		String binaryStr = Integer.toBinaryString(m);
//		System.out.println(binaryStr);
		
		for(int i=0; i<n; i++) {
			int number = input.nextInt();
			System.out.println(binaryStr.charAt(binaryStr.length()-number));
		}
		
		input.close();
	}
	
	private static void logFilter() {
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		String log = input.next();
		String[] strs = new String[count];
		boolean none = true;
		
		for(int i=0; i<count; i++) {
			strs[i] = input.next();
			
			for(int j=0; j<strs[i].length(); j++) {
				if(strs[i].charAt(j)==log.charAt(0) && j+log.length()<=strs[i].length()) {
					if(checkLog(j, strs[i], log)) {
						System.out.println(strs[i]);
						none = false;
						break;
					}
				}
			}
		}
		
		if(none) System.out.println("None");
		input.close();
	}
	
	private static boolean checkLog(int j, String str, String log) {
		String newStr = "";
		
		for(int i=j; i<j+log.length(); i++) {
			newStr += str.charAt(i);
		}
		
		if(log.equals(newStr)) return true;
		
		return false;
	}
	
	private static void cardArrangement() {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[4];
		
		for(int i=0; i<4; i++) {
			nums[i] = input.nextInt();
		}
		
		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
		
		System.out.println((nums[3]+nums[2])*10 + nums[1] + nums[0]);
		
		input.close();
	}
	
	private static void scoring() {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int minGrade = input.nextInt();
		
		int[][] studentInfo = new int[num][2];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				studentInfo[i][j] = input.nextInt();
			}
			
			int grade = studentInfo[i][0] - (studentInfo[i][1] * 5);
			if(grade<0) grade = 0;
			
			if(grade >= minGrade) System.out.println(i+1);
		}
		
		input.close();
		
	}
	
	private static void miniComputer() {
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		
		int[] a = new int[2];
		String control = "";
		int setA;
		int b;
		
		for(int i=0; i<count; i++) {
			control = input.next();
			if(control.equals("SET")) {
				setA = input.nextInt();
				b = input.nextInt();
				a[setA-1] = b;
			} else if(control.equals("ADD")) {
				b = input.nextInt();
				a[1] = a[0] + b;
			} else if(control.equals("SUB")) {
				b = input.nextInt();
				a[1] = a[0] - b;
			}
		}
		
		System.out.println(a[0] + " " + a[1]);
		input.close();
	}
	
	private static void perfectNumber() {
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		String str = "";
		
		int[] number = new int[count];
		for(int i=0; i<count; i++) {
			number[i] = input.nextInt();
			
			switch(checkPerfectNumber(number[i])) {
			case 1 :
				str = "nearly";
				break;
			case 0 :
				str = "perfect";
				break;
			default :
				str = "neither";
			}
			
			System.out.println(str);
		}
		
		input.close();
	}
	
	private static int checkPerfectNumber(int num) {
		int diff = 0;
		
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum += i;
			}
		}
		
		diff = num - sum;
		if(diff<0) diff *= -1;
		
		return diff;
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

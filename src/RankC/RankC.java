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
//		stormZone();
//		lot();
//		monsters();
//		lengthMatch();
//		tradeStocks();
//		boxForBalls();
//		candleFoot();
//		pointCard();
//		report();
		plusOrMultipl();
	}
	
	private static void plusOrMultipl() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if(x == y) {
				result += x * y;
			} else {
				result += x + y;
			}
		}
		
		System.out.println(result);
		
		input.close();
	}
	
	private static void report() {
		Scanner input = new Scanner(System.in);
		
		int k = input.nextInt();
		int n = input.nextInt();
		
		for(int i=0; i<k; i++) {
			int date = input.nextInt();
			int atari = input.nextInt();
			int score = 100/n;
			char scoreChar = 'D';
			
			score *= atari;
			
			if(date >= 1 && date <= 9) {
				score = score * 8 / 10; 
			} else if(date > 9) {
				score = 0;
			}
			
			if(score >= 80) {
				scoreChar = 'A';
			} else if(score >= 70) {
				scoreChar = 'B';
			} else if(score >= 60) {
				scoreChar = 'C';
			}
			
			System.out.println(scoreChar);
		}
		
		input.close();
	}
	
	private static void pointCard() {
		Scanner input = new Scanner(System.in);
		
		int price, date, point = 0;
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			date = input.nextInt();
			price = input.nextInt();
			
			int parsent = checkDate(date);
			
			point += price * parsent / 100;
		}
		
		System.out.println(point);
		
		input.close();
	}
	
	private static int checkDate(int date) {
		
		String dateStr = String.valueOf(date);
		
		for(int i=0; i<dateStr.length(); i++) {
			if(dateStr.charAt(i)=='3') return 3;
			if(dateStr.charAt(i)=='5') return 5;
		}
		
		return 1;
	}
	
	private static void candleFoot() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] priceList = new int[n][4];
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				priceList[i][j] = input.nextInt();
			}
		}
		
		int maxPrice = priceList[0][0];
		int minPrice = priceList[0][0];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				if(maxPrice < priceList[i][j]) {
					maxPrice = priceList[i][j];
				}
				if(minPrice > priceList[i][j]) {
					minPrice = priceList[i][j];
				}
			}
		}
		
		System.out.println(priceList[0][0] + " " + priceList[n-1][1] + " " + maxPrice + " " + minPrice);
		
		input.close();
	}
	
	private static void boxForBalls() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int r = input.nextInt();
		for(int i=0; i<n; i++) {
			int[] boxStatus = new int[3];
			for(int j=0; j<boxStatus.length; j++)
				boxStatus[j] = input.nextInt();
			if(checkBox(boxStatus, r))
				System.out.println(i+1);
		}
		
		input.close();
	}
	
	private static boolean checkBox(int[] boxStatus, int r) {
		
		for(int i=0; i<boxStatus.length; i++)
			if(boxStatus[i] < 2*r) return false;
		
		return true;
	}
	
	private static void tradeStocks() {
		Scanner input = new Scanner(System.in);
		
		int myStocks = 0;
		int profit = 0;
		
		int n = input.nextInt();
		int c1 = input.nextInt();
		int c2 = input.nextInt();
		
		int[] priceList = new int[n];
		for(int i=0; i<n-1; i++) {
			priceList[i] = input.nextInt();
			
			if(priceList[i] <= c1) {
				profit -= priceList[i];
				myStocks++;
			} else if(priceList[i] >= c2) {
				profit += myStocks * priceList[i];
				myStocks = 0;
			}
		}
		
		priceList[n-1] = input.nextInt();
		if(myStocks != 0) profit += myStocks * priceList[n-1];
		
		System.out.println(profit);
		
		input.close();
	}
	
	private static void lengthMatch() {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.next();
		String str2 = input.next();
		String answer = "No";
		
		if(str1.length() == str2.length()) answer = "Yes";
		
		System.out.println(answer);
		
		input.close();
	}
	
	private static void monsters() {
		Scanner input = new Scanner(System.in);
		
		boolean isEvolution = false;
		
		int[] stets = new int[3];
		for(int i=0; i<stets.length; i++) {
			stets[i] = input.nextInt();
		}
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			String name = input.next();
			int[] monsters = new int[6];
			for(int j=0; j<monsters.length; j++) {
				monsters[j] = input.nextInt();
			}
			
			if(checkMonster(stets, monsters)) {
				System.out.println(name);
				isEvolution = true;
			}
		}
		
		if(!isEvolution) System.out.println("no evolution");
		
		input.close();
	}
	
	private static boolean checkMonster(int[] stets, int[] monsters) {
		
		for(int i=0; i<stets.length; i++) {
			if(!(stets[i] >= monsters[i*2] && stets[i] <= monsters[i*2+1])) return false;
		}
		
		return true;
	}
	
	private static void lot() {
		Scanner input = new Scanner(System.in);
		
		
		int[] lotList = new int[6];
		for(int i=0; i<lotList.length; i++) {
			lotList[i] = input.nextInt();
		}
		
		int n = input.nextInt();
		
		int[][] playerList = new int[n][6];
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<playerList[i].length; j++) {
				playerList[i][j] = input.nextInt();
				if(checkLot(lotList, playerList[i][j])) count++;
			}
			System.out.println(count);
		}
		
		input.close();
	}
	
	private static boolean checkLot(int[] lotList, int playerList) {
		
		for(int i=0; i<lotList.length; i++) {
			if(lotList[i] == playerList) return true;
		}
		
		return false;
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

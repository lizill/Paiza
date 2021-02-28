package RankD;

import java.util.Scanner;

public class RankD {

	public static void main(String[] args) {
//		ichimanPo();
//		nKakuKata();
//		printString();
//		underLine();
//		plus();
//		email();
//		pencil();
//		aButtonbButton();
//		kazokude();
//		juice();
//		absoluteValue();
//		medalist();
//		wine();
//		makeKamakura();
//		automaticCharge();
//		nthSentence();
//		digits();
//		freight();
//		displayOfCalculator();
//		intervalTyphoons();
//		aFewDaysLater();
//		oddorEven();
//		calculateDensity();
//		tanzaku();
//		okashi();
//		screenConfiguration();
//		pyramids();
//		remainder();
//		numberOfMatches();
//		bonus();
//		beforeChrist();
//		polygon();
//		numberOfString();
//		charReduction();
//		negoOnContract();
//		schoolyard();
//		riceWeight();
//		chargingTime();
//		minutesToSeconds();
//		nutrition();
//		triangle();
//		dice();
//		productivityOfFactory();
//		remainingPages();
//		encloseString();
//		shoppingBag();
//		designationOfAirport();
//		calculationOfSurface();
//		threeFigures();
//		calculatePoints();
//		nthHeight();
		countDown();
	}
	
	public static void countDown() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		while(n >= 1) {
			System.out.println(n--);
		}
		
		input.close();
	}
	
	public static void nthHeight() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println(n/10*m);
		
		input.close();
	}
	
	public static void calculatePoints() {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += input.nextInt();
		}
		System.out.println(sum);
		
		input.close();
	}
	
	public static void threeFigures() {
		Scanner input = new Scanner(System.in);
		
		int sum = 1;
		for(int i=0; i<3; i++) {
			sum *= input.nextInt();
		}
		System.out.println(sum);
		
		input.close();
	}
	
	public static void calculationOfSurface() {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		System.out.println(6*a*a);
		
		input.close();
	}
	
	public static void designationOfAirport() {
		Scanner input = new Scanner(System.in);
		
		String st = input.next();
		String designation = "";
		for(int i=0; i<3; i++) {
			designation += st.charAt(i);
		}
		System.out.println(designation);
		
		input.close();
	}
	
	public static void shoppingBag() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		if(n>=1000) n += 3;
		System.out.println(n);
		
		input.close();
	}
	
	public static void encloseString() {
		Scanner input = new Scanner(System.in);
		
		String st = input.next();
		String c = input.next();
		System.out.println(c+st+c);
		
		input.close();
	}
	
	public static void remainingPages() {
		Scanner input = new Scanner(System.in);
		
		int pageM = input.nextInt();
		int pageN = input.nextInt();
		System.out.println(pageM - pageN);
		
		input.close();
	}
	
	public static void productivityOfFactory() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int h = input.nextInt();
		System.out.println(n*h);
		
		input.close();
	}
	
	public static void dice() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		System.out.println(7-n);
		
		input.close();
	}
	
	public static void triangle() {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(180-a-b);
		
		input.close();
	}
	
	public static void nutrition() {
		Scanner input = new Scanner(System.in);
		
		int purotein = input.nextInt();
		
		System.out.println(purotein*1500);
		
		input.close();
	}
	
	public static void minutesToSeconds() {
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		System.out.println(minutes*60);
		
		input.close();
	}
	
	public static void chargingTime() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		System.out.println(100-n);

		input.close();
	}
	
	public static void riceWeight() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n*150);

		input.close();
	}
	
	public static void schoolyard() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println(n*m);
		
		input.close();
	}
	
	public static void negoOnContract() {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='y') count++;
		}
		
		System.out.println(count);
		
		input.close();
	}
	
	public static void charReduction() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		String str = input.next();
		String newStr = "";
		
		for(int i=0; i<n; i++) {
			newStr += str.charAt(i);
		}
		
		System.out.println(newStr);
		
		input.close();
	}
	
	public static void numberOfString() {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int n = input.nextInt();
		
		System.out.println(str.charAt(n-1));
		
		input.close();
	}
	
	public static void polygon() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n/180+2);
		
		input.close();
	}
	
	public static void beforeChrist() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(m-n);
		
		input.close();
	}
	
	public static void bonus() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(n*m);
		
		input.close();
	}
	
	public static void numberOfMatches() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n*(n-1)/2);
		
		input.close();
	}
	
	public static void remainder() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(n%m);
		
		input.close();
	}
	
	public static void pyramids() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		input.close();
	}
	
	public static void screenConfiguration() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(n*n-m);
		
		input.close();
	}
	
	public static void okashi() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n/2);
		
		input.close();
	}
	
	public static void tanzaku() {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		input.close();
	}
	
	public static void calculateDensity() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(n*m);
		
		input.close();
	}
	
	public static void oddorEven() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		String str = "";
		if(n%2==0) {
			str = "even";
		} else str = "odd";
		
		System.out.println(str);
		
		input.close();
	}
	
	public static void aFewDaysLater() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n*7);
		
		input.close();
	}
	
	public static void intervalTyphoons() {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			num[i] = input.nextInt();
			if(i>0) {
				System.out.println(num[i]-num[i-1]);
			}
		}
		
		input.close();
	}
	
	public static void displayOfCalculator() {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a*b>=10000) {
			System.out.println("NG");
		} else {
			System.out.println(a*b);
		}
		
		input.close();
	}
	
	public static void freight() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(100+n*10);

		input.close();
	}
	
	public static void digits() {
		Scanner input = new Scanner(System.in);
		
		String num = input.next();
		
		System.out.println(num.length());
		input.close();
	}
	
	public static void nthSentence() {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print(str.charAt(i));
		}
		input.close();
	}
	
	public static void automaticCharge() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n<10000) n += 10000;
		
		System.out.println(n);
		input.close();
	}
	
	public static void makeKamakura() {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int result = a*a*a - b*b*b;
		
		System.out.println(result);
		input.close();
	}
	
	public static void wine() {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		System.out.println("Best in " + str);
		input.close();
	}
	
	public static void medalist() {
		Scanner input = new Scanner(System.in);
		
		String gold = input.next();
		String silver = input.next();
		String bronze = input.next();
		
		System.out.println("Gold " + gold);
		System.out.println("Silver " + silver);
		System.out.println("Bronze " + bronze);
		input.close();
	}
	
	public static void absoluteValue() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n<0) n *= -1;
		
		System.out.println(n);
		input.close();
	}
	
	public static void juice() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		System.out.println(n/m);
		input.close();
	}
	
	public static void kazokude() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int h = input.nextInt();
		int w = input.nextInt();
		
		int okashi = h*w;
		int result = okashi%n;
		
		System.out.println(result);
		input.close();
	}
	
	public static void bounenkai() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int nomihoudai = n*6000;
		int hutuu = m*4000;
		
		System.out.println(nomihoudai+hutuu);
		input.close();
	}
	
	public static void aButtonbButton() {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a-b);
		input.close();
	}
	
	public static void pencil() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		System.out.println(n*12);
		input.close();
	}
	
	public static void email() {
		Scanner input = new Scanner(System.in);
		String host = input.next();
		String domain = input.next();
		
		System.out.println(host + "@" + domain);
		input.close();
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

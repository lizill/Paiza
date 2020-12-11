package RankD;

import java.util.Scanner;

public class IchimanPo {

	public static void main(String[] args) {
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

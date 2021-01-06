package RankA;

import java.util.ArrayList;
import java.util.Scanner;

public class PaizaBallGame {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		int[] pins = new int[n];
		for(int i=0; i<n; i++) {
			String pin = input.next();
			if(pin.equals("G")) pins[i] = 0;
			else pins[i] = Integer.parseInt(pin);
		}
		
		ArrayList<Integer> score = new ArrayList<Integer>();

		for(int i=0; i<n-1; i+=2) {
			int pinsSum = pins[i] + pins[i+1];
			if(pins[i]==b) { // 스트라이크
				if(i==n-3) {
					score.add(pinsSum + pins[i+2] + pins[i+1] + pins[i+2]);
					i--;
				} else {
					score.add(pinsSum + pins[i+2]);
					i--;
				}
			}
			else if(pinsSum == b) { // 스페어
				if(i==n-3) {
					score.add(pinsSum + pins[i+2]*2);
				} else {
					score.add(pinsSum + pins[i+2]);
				}
			} else {
				score.add(pinsSum);
			}
		}
		
		int sumScore = 0;
		for(int i=0; i<a; i++) {
			System.out.print(score.get(i).toString() + " ");
			sumScore += Integer.parseInt(score.get(i).toString());
		}
		System.out.println();
		System.out.println(sumScore);
	}
}

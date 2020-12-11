package RankB;

import java.util.Scanner;

public class Hyou {

	public static void main(String[] args) {
		/*
			5 7
			1 5
			-2 1
			
			1 5 9 13 17 21 25
			-2 1 4 7 10 13 16
			-5 -3 -1 1 3 5 7
			-8 -7 -6 -5 -4 -3 -2
			-11 -11 -11 -11 -11 -11 -11
		 */

		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int w = input.nextInt();
		int[][] table = new int[h][w];
		table[0][0] = input.nextInt();
		table[0][1] = input.nextInt();
		table[1][0] = input.nextInt();
		table[1][1] = input.nextInt();
		
		int rows = table[0][1] - table[0][0];
		int colums = table[1][0] - table[0][0];
		int diff = rows-(table[1][1] - table[1][0]);
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w-1; j++) {
				System.out.print((table[0][0] + colums*i + rows*j) + " ");
			}
			System.out.print(table[0][0] + colums*i + rows*(w-1));
			System.out.println();
			rows -= diff;
		}
		
	}

}

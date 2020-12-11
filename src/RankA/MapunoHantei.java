package RankA;

import java.util.Scanner;

public class MapunoHantei {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);

		int rows = input.nextInt();
		int colums = input.nextInt();
		
		String[] board = new String[colums];
		for(int i=0; i<board.length; i++) { // make board
			board[i] = input.next();
		}
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<rows; j++) {
				if(checkBoard(board, i, j)) {
					System.out.println(i + " " + j);
				}
			}
		}
		
		input.close();
	}
	
	public static boolean checkBoard(String[] board, int i, int j) {
		boolean result = false;
		int count = 0;
		
		// check left
		if(j==0 || board[i].charAt(j-1) == '#') {
			count++;
		}
		
		// check right
		if(j==board[i].length()-1 ||  board[i].charAt(j+1) == '#') {
			count++;
		}
		
		// check up
		if(i==0 || board[i-1].charAt(j) == '#') {
			count++;
		}
		
		// check down
		if(i==board.length-1 || board[i+1].charAt(j) == '#') {
			count++;
		}
		
		if(count == 4) result = true;
		return result;
	}
}

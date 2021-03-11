package RankA;

import java.util.Scanner;

public class Hebi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int H = input.nextInt();
		final int W = input.nextInt();
		final int SY = input.nextInt();
		final int SX = input.nextInt();
		final int COUNT = input.nextInt();
		char[][] map = new char[H][W];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = input.next().charAt(0);
			}
		}
		
		int idxY = SY;
		int idxX = SX;
		int presentStep = 0;
		char dir = 'U';
		boolean isGameOver = false;
		
		map[idxY][idxX] = '*';
		for(int i=0; i<COUNT; i++) {
			
			// go
			String s = input.next();
			String [] ar =  s.split(" ");
			
			int countStep = Integer.parseInt(ar[0]);
			char turn = ar[1].charAt(0);
			
			for(int j=presentStep; j<countStep; j++) {
				switch (dir) {
				case 'U':
					idxY--;
					break;
				case 'D':
					idxY++;
					break;
				case 'R':
					idxX++;
					break;
				case 'L':
					idxX--;
					break;
				}
				
				if(map[idxY][idxX] == '.') { // if floor is '.'
					map[idxY][idxX] = '*';
				}
				else {
					isGameOver = true;
					System.out.println("장애물과 만남");
					break;
				}
			}
			if(isGameOver) break;
			
			presentStep = countStep;
			
			// turn
			if((dir == 'R' && turn == 'L') || (dir == 'L' && turn == 'R')) {
				dir = 'U';
			} else if((dir == 'R' && turn == 'R') || (dir == 'L' && turn == 'L')) {
				dir = 'D';
			} else if((dir == 'D' && turn == 'L') || (dir == 'U' && turn == 'R')) {
				dir = 'R';
			} else if((dir == 'U' && turn == 'L') || (dir == 'D' && turn == 'R')) {
				dir = 'L';
			}
		}
		System.out.println("종료");
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		input.close();
	}
}

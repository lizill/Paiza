package RankA;

import java.util.Scanner;

public class Hebi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 첫줄 변수
		final int H = input.nextInt();
		final int W = input.nextInt();
		final int SY = input.nextInt();
		final int SX = input.nextInt();
		final int COUNT = input.nextInt();
		
		// 맵 사이즈
		String[] readMap = new String[H];
		for(int i=0; i<readMap.length; i++) {
			readMap[i] = input.next();
		}
		char[][] map = new char[H][W];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = readMap[i].charAt(j);
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
			int countStep = input.nextInt();
			char turn = input.next().charAt(0);
			
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
				if(idxX >= W || idxY >= H || idxX < 0 || idxY < 0) {
					isGameOver = true;
					break;
				}
				if(map[idxY][idxX] == '.') { // if floor is '.'
					map[idxY][idxX] = '*';
				}
				else {
					isGameOver = true;
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
		
		if(!isGameOver) {
			for(int j=presentStep; j<100; j++) {
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
				if(idxX >= W || idxY >= H || idxX < 0 || idxY < 0) {
					isGameOver = true;
					break;
				}
				if(map[idxY][idxX] == '.') { // if floor is '.'
					map[idxY][idxX] = '*';
				}
				else {
					isGameOver = true;
					break;
				}
			}
		}
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		input.close();
	}
}

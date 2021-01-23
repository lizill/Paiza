package RankA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coastline {
	private static Scanner input = new Scanner(System.in);
	
	private final static int HEIGHT = input.nextInt()+2;
	private final static int WIDTH = input.nextInt()+2;
	
	private static int map[][] = new int[HEIGHT][WIDTH];
	private static void makeMap() {
		for(int i=0; i<HEIGHT-2; i++) {
			String mapline = input.next();
			for(int j=0; j<WIDTH-2; j++) {
				if(mapline.charAt(j)=='#') {
					map[i+1][j+1] = -1; // 초기값
				}
			}
		}
	}
	
	private static int countMap = 0;
	private static int islandIndex = 0;
	private static int isLand[][];

	private static void scanMap() {
		for(int i=0; i<HEIGHT; i++) {
			for(int j=0; j<WIDTH; j++) {
				if(map[i][j] == -1) {
					map[i][j] = ++islandIndex;
					checkAround(i, j);
				}
			}
		}
	}
	
	private static void checkAround(int i, int j) {
		if(map[i-1][j] == -1) {
			map[i-1][j] = islandIndex;
			checkAround(i-1, j);
		}
		if (map[i+1][j] == -1) {
			map[i+1][j] = islandIndex;
			checkAround(i+1, j);
		}
		if (map[i][j-1] == -1) {
			map[i][j-1] = islandIndex;
			checkAround(i, j-1);
		}
		if (map[i][j+1] == -1) {
			map[i][j+1] = islandIndex;
			checkAround(i, j+1);
		} 
	}
	
	private static void checkCoastline() {
		isLand = new int[islandIndex][2];
		
		for(int i=1; i<=islandIndex; i++) {
			for(int m=0; m<HEIGHT; m++) {
				for(int n=0; n<WIDTH; n++) {
					if(map[m][n] == i) {
						isLand[i-1][0]++;
						checkAroundC(m, n, i);
					}
				}
			}
		}
	}

	private static void checkAroundC(int m, int n, int i) {
		if(map[m-1][n] == 0) {
			isLand[i-1][1]++;
		}
		if (map[m+1][n] == 0) {
			isLand[i-1][1]++;
		}	
		if (map[m][n-1] == 0) {
			isLand[i-1][1]++;
		}
		if (map[m][n+1] == 0) {
			isLand[i-1][1]++;
		}
	}
	
	private static void sortIsland() {
		
		for(int i=0; i<isLand.length; i++) {
			int bigger = 0;
			int bigIndex = 0;
			
			for(int j=0; j<isLand.length; j++) {
				if(bigger <= isLand[j][0]) {
					bigger = isLand[j][0];
					bigIndex = j;
				}
			}
			
			System.out.println(isLand[bigIndex][0] + " " + isLand[bigIndex][1]);
			isLand[bigIndex][0] = 0;
		}
	}
	
	public static void main(String[] args) {
		makeMap();
//		for(int i=0; i<HEIGHT; i++) // 입력 및 맵 출력
//			System.out.println(Arrays.toString(map[i]));
		
		scanMap();
//		System.out.println("---------------------");
//		for(int i=0; i<HEIGHT; i++) // 섬별로 번호 붙이기
//			System.out.println(Arrays.toString(map[i]));
		
		checkCoastline();
//		for(int i=0; i<isLand.length; i++) // 출력
//			System.out.println(Arrays.toString(isLand[i]));

//		System.out.println("---------------------");
		sortIsland();
//		for(int i=0; i<isLand.length; i++) // 출력
//			System.out.println(Arrays.toString(isLand[i]));
	}
}

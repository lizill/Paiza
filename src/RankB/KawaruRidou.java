package RankB;

import java.util.Scanner;

public class KawaruRidou {

	public static void main(String[] args) {
		/*
		 * 開始時点の x , y 座標,移動の回数 N 
		 * 移動者ははじめ北を向いています。
		 */

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int n = input.nextInt();
		char[] move = new char[n];
		
		int front = 0; // 頭：北
		int count = 0;
		for(int i=0; i<n; i++) {
			move[i] = input.next().charAt(0);
			
			switch(front) {
				case 0 : // 北
					if(move[i]=='L') x--;
					else x++;
					break;
				case 1 : // 東
					if(move[i]=='L') y--;
					else y++;
					break;
				case 2 : // 南
					if(move[i]=='L') x++;
					else x--;
					break;
				case 3 : // 西
					if(move[i]=='L') y++;
					else y--;
			}

//			System.out.println(count);
//			System.out.println(front);
			System.out.println(x + " " + y);
			
			if(move[i]=='L') count--;
			else count++;
			
			if(count%4==0) front = 0;
			if(count%4==1 || count%4==-3) front = 1;
			if(count%4==2 || count%4==-2) front = 2;
			if(count%4==3 || count%4==-1) front = 3;
		}
		
		input.close();
	}
}

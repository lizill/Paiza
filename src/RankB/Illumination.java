package RankB;

import java.util.Scanner;

public class Illumination {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int[] tree = new int[n];
		for(int i=0; i<n; i++) {
			tree[i] = input.nextInt();
		}
		int q = input.nextInt();
		int[][] scanTree = new int[q][2];
		for(int i=0; i<q; i++) {
			for(int j=0; j<2; j++) {
				scanTree[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<q; i++) {
			int sum = 0;
			for(int j=scanTree[i][0]; j<=scanTree[i][1]; j++) {
				sum += tree[j-1];
			}
			int heikin = sum/(scanTree[i][1]-scanTree[i][0]+1);
			if(heikin < m) {
				int gap = m - heikin;
				for(int j=scanTree[i][0]; j<=scanTree[i][1]; j++) {
					tree[j-1] += gap;
				}
			}
		}
		
		for(int i=0; i<n-1; i++) {
			System.out.print(tree[i] + " ");
		}
		System.out.print(tree[n-1]);
		
		input.close();
	}

}

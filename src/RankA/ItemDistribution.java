package RankA;

import java.util.Scanner;

public class ItemDistribution {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] aitems = new int[N];

        combination(aitems, 2*N, N, 0, 0);
		System.out.println(count);
	}
	
	private static final int N = input.nextInt();
	private static final int K = input.nextInt();
	private static int count = 0;
	
	private static int[] allItems() {
		int[] allItems = new int[2*N];
		
		for(int i=0; i<2*N; i++) {
			allItems[i] = i+1;
		}
		
		return allItems;
	}
	
	private static boolean check(int[] aArr, int[] allitems) {
		int[] a = new int[N];
		int[] b = new int[N];
		int aIndex = 0;
		int bIndex = 0;
		
		for(int i=0; i<2*N; i++) {
			if(aArr[i] != 0) {
				a[aIndex++] = allitems[i];
			} else {
				b[bIndex++] = allitems[i];
			}
		}
		
		int[] diff = new int[N];
		for(int i=0; i<N; i++) {
			diff[i] = a[i] - b[i];
			if(diff[i] < 0) diff[i] *= -1;
		}
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += diff[i];
		}
		
		if(sum<=K) return true;
		
		return false;
	}
	
	private static void combination(int[] aitems, int n, int r, int index, int target) {
        if(r==0){
        	int[] aArr = new int[2*N];
            for(int i : aitems){
            	aArr[i] = i+1;
            }
            if(check(aArr, allItems())) count++;
            return;
        }
        if(target == n)return;
         
        aitems[index] = target;
        combination(aitems, n, r-1, index+1, target+1);
        combination(aitems, n, r, index, target+1);
    }
}

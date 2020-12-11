package RankB;

import java.util.Arrays;
import java.util.Scanner;

public class AiSyouCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		
		int[] arrS = makeArrS(s);
		int[] arrT = makeArrS(t);
		
//		System.out.println(Arrays.toString(arrS));
//		System.out.println(Arrays.toString(arrT));
		
		int sumST = sumST(arrS, arrT);
		int sumTS = sumTS(arrT, arrS);
		
//		System.out.println(sumST);
//		System.out.println(sumTS);
		
		if(sumST>sumTS) {
			System.out.println(sumST);
		} else {
			System.out.println(sumTS);
		}
	}
	
	public static int sumTS(int[] arrT, int[] arrS) {
		
		int[] sumArr = new int[arrT.length+arrS.length];
		for(int i=0; i<sumArr.length; i++) {
			if(i<arrT.length) {
				sumArr[i] = arrT[i];
			} else {
				sumArr[i] = arrS[i-arrT.length];
			}
		}
		
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr.length-1-i; j++) {
				sumArr[j] = sumArr[j] + sumArr[j+1];
				if(sumArr[j]>101) sumArr[j] -= 101;
			}
		}
		
		return sumArr[0];
	}
	
	public static int sumST(int[] arrS, int[] arrT) {
		
		int[] sumArr = new int[arrS.length+arrT.length];
		for(int i=0; i<sumArr.length; i++) {
			if(i<arrS.length) {
				sumArr[i] = arrS[i];
			} else {
				sumArr[i] = arrT[i-arrS.length];
			}
		}
		
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr.length-1-i; j++) {
				sumArr[j] = sumArr[j] + sumArr[j+1];
				if(sumArr[j]>101) sumArr[j] -= 101;
			}
		}
		
		return sumArr[0];
	}
	
	public static int[] makeArrS(String s) {
		int[] arrS = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			arrS[i] = (int)s.charAt(i)-96;
		}
		
		return arrS;
	}
	
	public static int[] makeArrT(String T) {
		int[] arrT = new int[T.length()];
		
		for(int i=0; i<T.length(); i++) {
			arrT[i] = (int)T.charAt(i)-96;
		}
		
		return arrT;
	}

}

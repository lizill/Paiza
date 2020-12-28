package RankB;

//import java.util.Arrays;
import java.util.Scanner;

public class TaxiFare {
	
	private static Scanner input = new Scanner(System.in);
	
	private static int countTaxi = input.nextInt();
	private static int distance = input.nextInt();
	private static int[][] taxyParameters = new int[countTaxi][4];
	private static void makeParameters() {
		for(int i=0; i<countTaxi; i++) {
			for(int j=0; j<4; j++) {
				taxyParameters[i][j] = input.nextInt();
			}
//			System.out.println(Arrays.toString(taxyParameters[i]));
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 택시갯수 가는거리
		 * 처음거리 처음요금 가산거리 가산요금
		 */
		
		makeParameters();
		int[] taxiFare = calculateFare(); // 각 택시의 요금
		
//		System.out.println(Arrays.toString(taxiFare));
		
		int max = taxiFare[0];
		int min = taxiFare[0];
		for(int i=1; i<taxiFare.length; i++) {
			if(max<taxiFare[i]) {
				max = taxiFare[i];
			} // 최댓값
			
			if(min>taxiFare[i]) {
				min = taxiFare[i];
			} // 최솟값
		}
		
		System.out.println(min + " " + max);
	}
	
	private static int[] calculateFare() {
		int[] taxiFare = new int[countTaxi];
		
		for(int i=0; i<countTaxi; i++) {
			
			while(true) {
				if(distance >= taxyParameters[i][0]) { // 처음거리보다 가는거리가 먼 경우
					// 처음요금에 가산요금을 더한다.
					taxyParameters[i][1] += taxyParameters[i][3];
					// 처음거리에 가산 거리를 더한다.
					taxyParameters[i][0] += taxyParameters[i][2];
				} else break;
			}
			
			taxiFare[i] = taxyParameters[i][1]; // 처음요금 + 가산요금을 넣어줌;
		}
		
		return taxiFare;
	}
	
}

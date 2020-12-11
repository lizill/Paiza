package RankD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NKakuKata {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int naikaku = 180*(n-2)/n;
		
		System.out.println(naikaku);
		
		br.close();
	}

}

package Day2;

import java.util.Arrays;

public class SubArrayPartision {

	public static void main(String[] args) {
		int a[] = {1,5,5,11}; 
		int sum = 0;
		int subSum =0;
		Arrays.sort(a);
		boolean flag = true;
		mainL :
		for(int j=0;j<a.length;j++){ 
			sum += a[j];
			subSum = 0;
			for(int k=j+1;k<a.length;k++) {
				subSum += a[k];
				
			}
			if(sum == subSum) {
				System.out.println("Yes");
				flag = false;
				break mainL;
			}
		}
		if(flag) {
			System.out.println("No");
		}
	}

}

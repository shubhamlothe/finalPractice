package Day2;

import java.util.Arrays;

public class MissinNoMinComplexity {
	public static int missingNumber(int[] nums) {
		 Arrays.sort(nums);
		   int l=0, r=nums.length;
		   while(l<r){
		       int m = (l+r)/2;
		       if(nums[m]>m){
		           r=m;
		       }else{
		           l=m+1;
		       }
		   }
		 
		   return r;
	}
	public static void main(String[] args) {
		int a[] = new int[10000];
		Arrays.fill(a, 0, 9998, 1);
		a[9999]=10000;
		int missNo = missingNumber(a);
		System.out.println("Missing No = "+missNo);
		
	}
}

package Day2;

public class arrayPartion {

	public static void main(String[] args) {
		int a[] = {2,2,2,2,2,2};
		int max = a[0];
		int sum = 0;
		for(int i=0;i < a.length;i++ ) {
			if(max<a[i]) {
				max = a[i];
			}
			sum += a[i];
		}
		sum = sum - max;
		
		if(sum == max) {
			System.out.println("Yes");
		}
		else {
			int subSum = 0;
			sum =max;
			boolean flag=true;
			for(int j=0;j<a.length;j++) {
				subSum = 0;
				max  = max + a[j];
				for(int k=0;k<a.length;k++) {
					if(a[k]==sum || k==j) {
						continue;
					}
					subSum += a[k]; 
				}
				System.out.println("subSum= "+subSum+"  max= "+max);
				if(max == subSum) {
					System.out.println("Yes");
					flag=false;
					break;
				}
				else {
					max -= a[j];
				}
			}
			if(flag) {
				System.out.println("No");
			}
		}

	}

}

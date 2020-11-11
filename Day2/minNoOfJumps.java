package Day2;

public class minNoOfJumps {

	public static void main(String[] args) {
		int arr [] = {5, 1};
		int jump = 0;
		boolean flag=true;
		for(int i=0;i<arr.length;) {
			
			if(arr[i]<=0) {
				System.out.println("-1");
				flag=false;
				break;
			}
			
			if(i<arr.length-1) {
				jump++;
			}
			
			if(i==0) {
				i+=arr[i];
			}else {
				i+=arr[i];
			}
		}
		
		if(flag) {
			System.out.println(jump);
		}
		
	}

}

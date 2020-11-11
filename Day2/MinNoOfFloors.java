package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class MinNoOfFloors {
		public static int superEggDrop(int N, int K) {
	        
	        int[] floors = new int[N + 1];
	        int dropExperiments = 1;
	        Arrays.fill(floors, 1, floors.length, 1);
	        
	        int[] temp = new int[N + 1];
	        
	        while(floors[N] < K) {
	            for(int i=1; i < N + 1; i++) {
	                temp[i] = floors[i-1] + floors[i] + 1;
	            }
	            System.out.println("Temp :");
	            for(int i : temp) {
	            	System.out.print(i+" ");
	            }
	            System.out.println("");
	            System.out.println("Floors :");
	            for(int j : floors) {
	            	System.out.print(j+" ");
	            }
	            floors = Arrays.copyOf(temp, temp.length);
	            dropExperiments += 1;
	            System.out.println("");
	        }
	        System.out.println("No of Experiments = "+dropExperiments);
	        System.out.println("Total Floors = "+floors[N]);
	        return (floors[N]-1)/2 ;
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=2;//eggs
		int K=6;//floors
		
		int result = superEggDrop( N,  K);
		System.out.println("Minimum Non-breaking Floor = "+result);
	}

}

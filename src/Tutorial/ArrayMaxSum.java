package Tutorial;

//maxSumofSubArray = ?
public class ArrayMaxSum {
	public static void main(String[] args) {
		
//		int[] ar = {-2,1,2,-2,4,-1,-2,4};
		int[] ar = {-1,-2,-3, -1};
		int maxSum = ar[0];	//-1
		int currentSum = 0;   //reset to zero if negative
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {	
				
				currentSum += ar[j];	//1
				if(currentSum > maxSum){
					maxSum = currentSum;	//1
				}
				if(currentSum < 0) {
					currentSum = 0;	//0
				}
			}
		}
		
		System.out.println("Max sum of aubarray: "+ maxSum);
		
		

	}

}

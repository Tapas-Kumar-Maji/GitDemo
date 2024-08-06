package Tutorial;

public class TwoSum {
	
	public static void main(String[] args) {
		int ar[] = {6,5,9,7,4};
		int target = 10;
		int flag = 0;
		
		for(int i=0; i<ar.length; i++) {	//i=0
			
			for(int j=i+1; j<ar.length; j++) {	//i=0, j=2
				
				if(ar[i] + ar[j] == target) {		
					flag = 1;
					System.out.println(i+" " +j);
					break;
				}
				}
			
			 if(flag == 1){
				break;
			}
		}
	}

}

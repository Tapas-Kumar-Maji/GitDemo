package Tutorial;

public class Prob1 {

	public static int maxIndex(int steps, int badIndex) {
        int maxiumindex = 0;
        for(int i=0; i<steps; i++){
            if(i != badIndex){
                maxiumindex += Math.pow(2, steps-i-1);
            }
        }
        return maxiumindex;

    }
	
	public static void main(String[] args) {
		int num = maxIndex(4, 6);
		System.out.println(num);
	}

}

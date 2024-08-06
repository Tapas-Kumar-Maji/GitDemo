package Tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ProbIBM2 {
    public static String partitionArray(int K, List<Integer> nums) {
        
        int N = nums.size();
        if(N % K != 0 || K > N){
            return "No";
        }
        
        Map<Integer, TreeSet<Integer>> idx = new HashMap<>();
        for(int i=0; i<nums.size(); i++){
            idx.computeIfAbsent(nums.get(i), k -> new TreeSet<>()).add(i);
        }
        
        boolean[] visited = new boolean[N];
        int total_visited = 0;
        
        for(int i=0; i<nums.size(); i++){
            if(visited[i]){
                continue;
            }
        
        
        int num = nums.get(i);
        int last_index = i;
        visited[i] = true;
        total_visited++;
        
        for(int j=num+1 ; j<num+K; j++){
            if(!idx.containsKey(j) || idx.get(j).size() == 0){
                return "No";
            }
            
            int next_iindex = idx.get(j).tailSet(last_index+1).first();
            if(next_iindex <= last_index){
                return "No";
            }
            
            last_index = next_iindex;
            visited[last_index]= true;
            total_visited++;
            idx.get(j).remove(last_index);
            
        }
        }
        return "Yes";
    }
    
    public static void main(String[] args) {
    	List<Integer> nums = new ArrayList<>();
    	nums.add(1);
    	nums.add(2);
    	nums.add(2);
    	nums.add(3);
		String s = partitionArray(3, nums);
		System.out.println(s);
	}

}


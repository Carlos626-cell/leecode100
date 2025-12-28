import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution3 {
    public int longestConsecutive(int[] nums) {
        int a = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,new ArrayList<>(List.of(num)));
            for(int num2 : nums) {
                if(Math.abs(num - num2) == 1){
                    map.computeIfAbsent(num2,k -> new ArrayList<>()).add(num2);
            }

        }
    }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(map.values());
        for(int i=0;i<list.size()-1;i++){
            a = Math.max(list.get(i).size(),list.get(i+1).size());

        }
        return a;
    }
}

import java.util.HashMap;

class Solution2{
    public int[] twosum(int[] sums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sums.length;i++){
            if(map.containsKey(target - sums[i])) {
                return new int[]{map.get(target - sums[i]), i};
            }
                        map.put(sums[i],i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

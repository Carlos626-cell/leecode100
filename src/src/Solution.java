import java.util.*;

class Solution{
    public List<List<String>> a(String[] str ){
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : str){
            char[] a = s.toCharArray();
            char[] b = Arrays.copyOf(a,a.length);
            Arrays.sort(a);
            String key = new String(a);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);


        }
        return new ArrayList<>(map.values());
}}

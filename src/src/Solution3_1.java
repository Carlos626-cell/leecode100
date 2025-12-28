import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution3_1 {
    public int longestConsecutive(int[] nums) {
        int a = 0;

        // 1. 建立 map，每个数字对应一个列表
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int num : nums) {
            // 改：List.of(num) 可以用单独 ArrayList 构造，兼容低版本 Java
            map.put(num, new ArrayList<>());
        }

        // 2. 遍历每一对数字，建立相差 1 的关系
        for (int num : nums) {
            for (int num2 : nums) {
                if (Math.abs(num - num2) == 1) {
                    // 改：加的是 num2 还是 num？根据你的思路，保留 num2
                    // 这里 computeIfAbsent 其实没必要，因为 map 已经 put 过所有 num
                    map.get(num).add(num2);
                }
            }
        }

        // 3. 遍历 map 的 value，找最大长度
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(map.values());
        for (ArrayList<Integer> l : list) {
            if (l != null) { // 防止空指针
                a = Math.max(a, l.size() + 1); // +1 算上自己
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(sol.longestConsecutive(nums1)); // 输出 4
    }
}

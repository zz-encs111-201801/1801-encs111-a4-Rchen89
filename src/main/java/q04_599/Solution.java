package q04_599;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// Minimum Index Sum of Two Lists
// https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<int[], String> map = new HashMap<>();

        for (int i = 0;i<list1.length;i++){
            for (int j = 0; j < list2.length; j++){
                if (list1[i] == list2[j]){
                    map.put(new int[]{i, j},list1[i]);
                }
            }
        }

        int smallestIndexCombo = 2000;
        int[] smallestCombo = new int[]{0,0};

        for (Map.Entry<int[], String> entry: map.entrySet()){
            if(entry.getKey()[0] + entry.getKey()[1]< smallestIndexCombo){
                smallestIndexCombo = entry.getKey()[0] + entry.getKey()[1];
                smallestCombo = entry.getKey();
            }
        }
        String[] result = new String[]{map.get(smallestCombo)};

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(
            Arrays.toString(solution.findRestaurant(list1, list2))
        );
    }
}
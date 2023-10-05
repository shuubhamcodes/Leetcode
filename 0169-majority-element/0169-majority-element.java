// class Solution {
//     public int majorityElement(int[] nums) {
    
//     HashMap<Integer,Integer> map = new HashMap<>();
//     for(int i = 0;i<nums.length;i++){
//         if(map.containsKey(nums[i])){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
        

//     }
    
//   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > nums.length/2) {
//                 return entry.getKey();
//             }
//         }
// return -1;

//     }
// }





class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
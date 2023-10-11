class Solution {
    public int[] rearrangeArray(int[] nums) {
      ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
                    
            }else{
                list2.add(nums[i]);
                
}
            
            
            
        }
        
        for(int i =0;i<nums.length/2;i++){
        nums[2*i]=list.get(i);
        nums[2*i+1]=list2.get(i);
                
                
}
        return nums;
        
        
    }
}
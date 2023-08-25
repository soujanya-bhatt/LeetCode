class Solution {
    public int removeDuplicates(int[] nums) {

        int [] a = new int[nums.length];
        int k = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                a[k-1] = nums[i];
                k++;
            }
        }
        a[k-1] = nums[nums.length-1];

        for(int i = 0 ;i< a.length;i++){
            nums[i] = a[i];
        }

        return k;       
    }
}

// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int k = 0;
//         for(int i = 1;i<nums.length;i++){
//             if(nums[i] != nums[k]){
//                 k++;
//                 nums[k] = nums[i];
//             }
//         }
//         return k+1;       
//     }
// }

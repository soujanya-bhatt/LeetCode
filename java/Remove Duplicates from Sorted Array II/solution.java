// class Solution {
//     public int removeDuplicates(int[] nums) {

//         int [] ans = new int[nums.length];
//         if(ans.length >= 3){
//             ans[0] = nums[0];
//             ans[1] = nums[1];
//         } else {
//             return nums.length;
//         }
//         int count = 0;
//         if(ans[0] == ans[1]){
//             count = 2;
//         }
//         int k = 1;
//         for(int i=1;i<nums.length-1;i++){
//             System.out.println("i = "+i);
//             System.out.println("ans[k] = "+ans[k]);
//             System.out.println("nums[i+1] = "+nums[i+1]);
//             System.out.println("count = "+count);
//             if(ans[k] != nums[i+1]){
//                 count = 0;
//                 System.out.println("count if = "+count);
//                 ans[++k] = nums[i+1];
//             } else if(count == 2 && ans[k] == nums[i+1]){
//                 System.out.println("if");
//                 continue;
//             } else if(count !=2 && ans[k] == nums[i+1]){
//                 System.out.println("if else ");
//                 ans[++k] = nums[i+1];
//                 count = 2;
//             } 
//         }   

//         for(int i = 0;i<ans.length;i++){
//             nums[i] = ans[i];
//         }
//         return k+1;
//     }
// }



class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i=2; i<nums.length; ++i) {
            if (nums[i] != nums[k - 1]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}

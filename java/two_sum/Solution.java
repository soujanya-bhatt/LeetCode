//Sol - 1: BruteForce approach
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            for (int j = i+1; j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    ans[0] = i;
                    ans[1] = j; 
                }
            }
        }
        return ans;
    }
}

//Sol - 2: HashTable approach
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hash = new HashMap<>();
        // int[] ans = new int[2];
        for(int j = 0;j<nums.length;j++){
            hash.put(nums[j],j);
        }

        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(hash.containsKey(diff) && hash.get(diff)!=i){
                return new int[]{i, hash.get(diff)};
            } 
        }
        return new int[]{};
    }
}

//Sol - 3: Two pointers approach - efficient
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int start = 0;
        int next = 1;
        int pos = 1;
        while(true){
            if(nums[start] + nums[next] == target){
                break;
            } else if(next == nums.length-1){
                start = 0;
                pos++;
                next = pos;
            } else{
                start++;
                next++;
            }
        }
        return new int[]{start,next};
    }
}

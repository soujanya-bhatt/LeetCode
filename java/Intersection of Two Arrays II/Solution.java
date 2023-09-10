class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0 ,j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>  ans = new ArrayList<Integer>();
      
        // ArrayList<Integer> arr1 = new ArrayList<Integer>();
        // for(int elem : nums1){
        //     arr1.add(elem);
        // }
        // ArrayList<Integer> arr2 = new ArrayList<Integer>();
        // for(int elem : nums2){
        //     arr2.add(elem);
        // }
        // Collections.sort(arr1);
        // Collections.sort(arr2);

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] sol = new int[ans.size()];
        for(int k = 0;k<ans.size();k++){
            sol[k] = ans.get(k);
        }
        return sol;
    }
}

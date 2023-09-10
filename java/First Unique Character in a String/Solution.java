//solution - 1: 34 ms
class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        for(int i = 0; i<s.length();i++){
            if(hash.get(s.charAt(i)) == null){
                hash.put(s.charAt(i), 1);
            } else {
                int count = hash.get(s.charAt(i))+1;
                hash.put(s.charAt(i), count);
            }
            
        }

        for(int i = 0; i<s.length();i++){
            if(hash.get(s.charAt(i)) == 1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

//solution - 2: 1 ms
// class Solution {
//     public int firstUniqChar(String s) {
//         int min = Integer.MAX_VALUE;
//         for(int i = 'a'; i <= 'z'; i++) {
//             int index = s.indexOf(i);

//             if(index != -1 && s.lastIndexOf(i) == index) {
//                 min = Math.min(min, index);
//             }
//         } 
//         return min != Integer.MAX_VALUE ? min : -1;  
//     }
// }

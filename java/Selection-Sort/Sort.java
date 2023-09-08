public class Sort{
    
    public static void main(String[] args){
        
        int arr[] = {4, 10, -1, 3, 100, 23, 41, -120, 45};
        int i = 0;
        
        while(i<arr.length-1){
            int minValue = arr[i];
            int minIndex = i;
            int j = i+1;
            while(j<arr.length) {
                if(arr[j]<minValue){
                    minValue = arr[j]; 
                    minIndex = j;
                }
                j++;
            }
            //swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            i++;
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}

public class Sort{
    
    public static void main(String[] args){
        
        int arr[] = {4, 10, -1, 3, 100, 23, 41, -120, 45};
        
        for(int i = 1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}

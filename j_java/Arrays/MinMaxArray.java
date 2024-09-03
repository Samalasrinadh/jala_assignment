// 8. Function to find the minimum and maximum value of an array
class MinMaxArray{
    public static int min(int[] arr){
        int minVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }
    
    public static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    
    public static void main(String[] args){
        int[] nums={15,25,5,30};
        System.out.println("Minimum: "+min(nums));
        System.out.println("Maximum: "+max(nums));
    }
}

// 2. Function to calculate the average value of an array of integers
class AvgArray{
    public static double avg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (double)sum/arr.length;
    }
    public static void main(String[] args){
        int[] nums={2,4,6,8};
        System.out.println("Average: "+avg(nums));
    }
}

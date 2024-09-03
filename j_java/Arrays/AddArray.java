// 1. Function to add integer values of an array
class AddArray{
    public static int add(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        System.out.println("Sum: "+add(nums));
    }
}

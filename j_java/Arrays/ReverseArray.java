// 9. Function to reverse an array of integer values
import java.util.Arrays;

class ReverseArray{
    public static int[] reverse(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[arr.length-i-1];
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        nums=reverse(nums);
        System.out.println("Reversed Array: "+Arrays.toString(nums));
    }
}

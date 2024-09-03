// 6. Function to copy an array to another array
import java.util.Arrays;

class CopyArray{
    public static int[] copy(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] newNums=copy(nums);
        System.out.println("Copied Array: "+Arrays.toString(newNums));
    }
}

// 5. Function to remove a specific element from an array
import java.util.Arrays;

class RemoveElem{
    public static int[] remove(int[] arr,int val){
        int[] newArr=new int[arr.length-1];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                newArr[idx++]=arr[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] nums={10,20,30,40};
        nums=remove(nums,20);
        System.out.println("Array after removal: "+Arrays.toString(nums));
    }
}

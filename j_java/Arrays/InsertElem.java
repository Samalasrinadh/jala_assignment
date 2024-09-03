// 7. Function to insert an element at a specific position in the array
import java.util.Arrays;

class InsertElem{
    public static int[] insert(int[] arr,int val,int pos){
        int[] newArr=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
        newArr[pos]=val;
        for(int i=pos;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    public static void main(String[] args){
        int[] nums={10,20,30,40};
        nums=insert(nums,25,2);
        System.out.println("Array after insertion: "+Arrays.toString(nums));
    }
}

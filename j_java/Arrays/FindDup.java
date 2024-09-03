// 10. Function to find the duplicate values of an array
import java.util.HashSet;

class FindDup{
    public static void findDups(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                System.out.println("Duplicate found: "+arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,2,4,5,3};
        findDups(nums);
    }
}

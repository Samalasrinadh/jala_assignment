// 4. Function to test if array contains a specific value
class Contains{
    public static boolean contains(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={5,10,15,20};
        System.out.println("Contains 15? "+contains(nums,15));
    }
}

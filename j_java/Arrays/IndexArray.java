// 3. Program to find the index of an array element
class IndexOf{
    public static int findIndex(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={10,20,30,40};
        int idx=findIndex(nums,30);
        if(idx!=-1){
            System.out.println("Index: "+idx);
        }else{
            System.out.println("Element not found.");
        }
    }
}

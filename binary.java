public class binary {
    static boolean binarySearch(int array[],int target){
        int n=array.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==array[mid]){
           return true;
            }
            else if(target<array[mid]){
           end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int array[]={22,33,34,38,89,72,};
        int target=38;
             System.out.println( binarySearch(array,target));
        
    }
}

import java.util.Arrays;

public class BinSearch{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=11;
         System.out.println(Arrays.toString(arr));

        int a=sear(arr,target);
        System.out.println("element found at: "+a);
        
    }
    static int sear(int arr[],int target)
    {   
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
        int mid=(start+end)/2;
        if(arr[mid]<target)
            start=mid+1;    
        else if(target<arr[mid])
            end=mid-1;
        else
            return mid;
    } 
    return -1;
    }  
}
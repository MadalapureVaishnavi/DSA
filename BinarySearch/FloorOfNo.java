import java.util.Arrays;

public class FloorOfNo{
    public static void main(String[] args) {
        int[] arr={11,22,33,44,49,55,77,88,99};
        int target=10;
         System.out.println(Arrays.toString(arr));

        int a=sear(arr,target);
        System.out.println("element found at: "+a);
        
    }
    static int sear(int arr[],int target)
    {   
        if(target<(arr[0]))
        {
            return -1;
        }
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
    return arr[end];
    }  
}
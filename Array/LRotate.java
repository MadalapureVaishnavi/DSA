import java.util.Arrays;

public class LRotate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int temp=arr[0];
        for (int i = 1; i <= arr.length-1; i++) {   
            arr[i-1]=arr[i]; 
        }
        int b=arr.length-1;     
        arr[b]=temp;
        
        System.out.println(Arrays.toString(arr));
    }
}

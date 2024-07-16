import java.util.Arrays;
public class RRotate {
    public static void main(String[] args) {
    int [] arr={1,2,3,4};
    int temp=arr.length-1;
    int b=arr[temp];
    for (int i = 0; i <= arr.length-2; i++) 
    {   
        arr[i+1]=arr[i]; 
    }        
    arr[0]=b;
    System.out.println(Arrays.toString(arr));
    }
}



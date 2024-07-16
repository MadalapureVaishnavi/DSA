// public class LargeEle{
//     public static void main(String[] args) {
//         int arr[]={1,5,3,7};

//         int large=arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if(large<arr[i])
//             {
//                 large=arr[i];
                
//             }
//         }
//         System.out.println(large);
//     }
// }



import java.util.Arrays;

public class LargeEle
{
    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=1;
        arr[1]=5;
        arr[2]=3;
        arr[3]=73;
        arr[4]=2;
        arr[5]=6;

       for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
             if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
       }
       System.out.println(Arrays.toString(arr));
       int large=arr.length-1;
       System.out.println(arr[large]);
    }
}
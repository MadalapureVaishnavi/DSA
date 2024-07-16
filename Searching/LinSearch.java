// import java.util.Scanner;
// public class LinSearch {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the element to be search:");
//         int n=sc.nextInt();
//         int[] arr={1,4,23,78};
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==n)
//             {
//                 System.out.println(n+" is present in array");
//             }   
//         }
//         System.out.println(n+" is not present in array");
//     }
// }



class LinSearch{
    public static void main(String[] args) {
        int[] array = {9,1,3,52,24};
        int index = linearSearch(array,224);

        if(index!=-1)
        {
            System.out.println(index);
        }
        else{
            System.out.println("element not found");
        }
    }

    private static int linearSearch(int[] array,int value)
    {
        for(int i=0;i<=array.length;i++)
        {
            if(array[i]==value)
            {
                return i;
            }
        }
        return -1;
    }
}

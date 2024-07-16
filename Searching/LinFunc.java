// import java.util.Scanner;

// public class LinFunc {
//     public static void main(String[] args) {
//         int[] arr={1,4,56,7,3};
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         LinDemo(arr,n);
//     }
//     static void LinDemo(int arr[],int s)
//     {
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==s)
//             {
//                 System.out.println(s+" is present in array");
//                 // return i;
//             }   
//         }
//     }
// }





public class LinFunc{
    public static void main(String[] args) {
        String[] arr={"abc","sdsfs","sfdfs"};
        String search="abac";
        String demo=LinSearch(arr,search);
        System.out.println(demo);
    }
    static String LinSearch(String arr[],String search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return search;
            }
        }
        return null;
    }
}

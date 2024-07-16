public class MinLinSerch {
    public static void main(String[] args) {
        int[] arr={32,3,34};
        int a=min(arr);
        System.out.println(a);
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i]; 
            }
        }
       return ans;
    }
}

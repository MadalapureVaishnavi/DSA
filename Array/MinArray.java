public class MinArray {
    public static void main(String[] args) {
        
        int[] arr={2,5,-3,9,24,-5};
        int ans=min(arr);
        System.out.println(ans);
    }

    public static int min(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}

public class Firstlast {
    public static void main(String[] args) {
        int[] arr={1,3,4,4,4,4,5,4,6};
        int no=demo(arr);
        int no2=demo2(arr);
       System.out.print(no+"  "+no2);
    }

    static int demo(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==4)
            {
                return i;
            }
            
    }
     return -1;
} 
        static int demo2(int arr[])
        {
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==4)
            {
                return i;
            }
        }   
        return -1;
    }
}


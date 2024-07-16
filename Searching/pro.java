public class pro {
    public static void main(String[] args) {
        //find numbers with even number of digits
        int[] arr={12,3457,22,7896,6};
        // System.out.println(arr[0].length);
        // for (int i = 0; i < arr.length; i++) {
            evnodd(arr);
        

    }
    static void evnodd(int arr[]){
        int count=0;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            while(num>0)
            {     
                num=num/10;
                count++;
            }
            if(count%2==0)
            {
                c++;       
            }
        }
            System.out.println(c);
        
    }
}





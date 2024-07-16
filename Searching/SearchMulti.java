public class SearchMulti {
    //search element in multidimensional array
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3},
            {4,5},
            {7,8,9}
        };
        int search=50;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==search)
                {
                    System.out.println(search+"found in array");
                }
            }
           
        }
         System.out.println(search+" not found in array");
    }
}

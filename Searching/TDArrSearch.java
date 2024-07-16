public class TDArrSearch {
    public static void main(String[] args) {
        int[][] arr={
            {5,7,8},
            {2,6,3}
        };
        int target=3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

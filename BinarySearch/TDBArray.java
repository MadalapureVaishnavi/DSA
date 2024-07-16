public class TDBArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6}
        };

        // int[] a=binaryS(arr, 3);
        System.out.println(Arrays.toString(binaryS(arr,3)));
    }

        static int[] binaryS(int[][] matrix,int target)
        {
            int r=0;
            int c=matrix.length;
            while(r<matrix.length && c>=0)
            {
                if(matrix[r][c]==target)
                {
                    return new int[] {r,c};
                }
                if(matrix[r][c]<target)
                {
                    r++;
                }
                else{
                    c--;
                } 
            }
            return new int[]{-1,-1};
        }
    }
    


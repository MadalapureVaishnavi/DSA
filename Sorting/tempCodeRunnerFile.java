public class selection {
    public static void main(String[] args) {
        int array[] = { 9, 4, 1, 3, 2, 6, 8, 7 };
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                int temp = array[i];
                array[i] = min;
                min = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}


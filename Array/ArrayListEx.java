import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(23);
        list.add(2324);
        list.add(98);
        System.out.println("Size of array    "+list.size());
        System.out.println("Contains Function   "+list.contains(2));
        System.out.println("Displaying Method   "+list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"   ");
        }
    }
}

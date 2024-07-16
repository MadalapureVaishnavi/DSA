// import java.util.Stack;
// public class demo {
//     public static void main(String[] args) {
//         Stack<String> stack = new Stack<String>();
        
//         stack.push("Inderbai");
//         stack.push("Gokul");
//         stack.push("Surekha");
//         stack.push("Shubham");
//         stack.push("Vaishnavi");
//         stack.push("Shweta");

//         System.out.println(stack);
//         System.out.println(stack.peek());

//         for(int i=0;i<=5;i++)
//         {
//             stack.pop();
//         }
//         System.out.println(stack.empty());
        
//     }
// }






//LinkedList

import java.util.LinkedList;

public class demo{
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        //linkedlist as stack
        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("E");
        // linkedlist.pop();


        // linkedlist as queue
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("f");
        linkedlist.poll();

        linkedlist.add(4,"E");
        linkedlist.remove("E");

        System.out.println(linkedlist.indexOf("f"));
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peeklast());

        
        System.out.println(linkedlist);


    }
}

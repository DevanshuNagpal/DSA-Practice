import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
//        stack.push(344);
//        stack.push(3344);
//        stack.push(341);
//        stack.push(343);
//        stack.push(345);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> que = new LinkedList<>();
//        que.add(3);
//        que.add(32);
//        que.add(65);
//        que.add(4);
//        que.add(33);
//        System.out.println(que.peek());
//        System.out.println(que.remove());

//No capacity restriction
//        Add remove from both sides
//        null element not allowd
//        Not thread safe
//        faster than linked list and stack
        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(98);
        deq.add(8);
        deq.add(9);
        deq.add(4);
        deq.add(32);
        deq.add(44);

        System.out.println();

    }
}

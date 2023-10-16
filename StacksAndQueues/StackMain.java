public class StackMain {
    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(5);
        stack.push(344);
        stack.push(3344);
        stack.push(341);
        stack.push(343);
        stack.push(345);
        stack.push(75);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Stack's size: " + myStack.size());

        System.out.println("Remove element from stack: ");
        System.out.println(myStack.pop());

        System.out.println(myStack.size());
    }
}

public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public int size() {
        return index;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public void push (int element) {
        if (isFull()) {
            throw new StackOverflowError("It's full!!");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

}

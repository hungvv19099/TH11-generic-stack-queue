package th4;

public class MyStack {
    private int size;
    private int[] arr;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is Full");
        }
        arr[index] = element;
        index++;
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
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return arr[--index];
    }
    public int size() {
        return index;
    }

}

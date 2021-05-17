package DataStructures;

public class StackImpl<T extends Comparable<T>> implements Stack<T>{

    Node<T> top = null;

    @Override
    public void push(T item) {
        Node<T> node = new Node<T>(item, null);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    @Override
    public T pop() {
        var temp = top;
        top = top.next;
        return temp.value;
    }

    @Override
    public T peek() {
        return top.value;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }







//    int next = 0;
//    T [] numbers;
//
//    public StackImpl(int size) {
//        numbers = new int[size];
//    }
//
//    public void push(Integer item) {
//        numbers[next] = item;
//        next++;
//    }
//
//    public T pop() {
//        Integer returnInteger = numbers[next-1];
//        next--;
//        return returnInteger;
//    }
//
//    public T peek() {
//        return numbers[next-1];
//    }
//
//    public boolean isEmpty() {
//        return next == 0;
//    }
}

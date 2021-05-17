package DataStructures;

public class Node<T extends Comparable<T>>{
    T value;
    Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

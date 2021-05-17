package DataStructures;

public class QueueImpl<T extends Comparable<T>> implements Queue<T> {

    Node<T> front = null;
    Node<T> back = null;

//    private static class Node<T> {
//        T value;
//        Node<T> next;
//
//        public Node(T value, Node<T> next) {
//            this.value = value;
//            this.next = next;
//        }
//    }

    public void enqueue(T item) {
        Node<T> node = new Node<T>(item, null);
        if (back == null) {
            front = back = node;
        } else {
            back.next = node;
            back = back.next;
        }
    }

    public T dequeue() {
        var currentFront = front;
        if (front.next != null) {
            front = front.next;
        } else {
            front = null;
            back = null;
        }
        return currentFront.value;
    }

    public T peek() {
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

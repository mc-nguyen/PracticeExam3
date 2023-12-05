public class SinglyLinkedList<E> {
    // instance variables
    private int size;
    private SinglyLinkedListNode<E> head;
    private SinglyLinkedListNode<E> tail;
    
    // constructors
    public SinglyLinkedList() { size = 0; }
    public SinglyLinkedList(E element) {
        size = 1;
        head = new SinglyLinkedListNode<E>(element, null);
        tail = head;
    }
    
    // instance methods
    public int getSize() { return size; }
    public void append(E element) {
        if (size == 0) {
            head = new SinglyLinkedListNode<E>(element, null);
            tail = head;
        } else {
            tail.setNextNodeLink(new SinglyLinkedListNode<E>(element, null));
            tail = tail.getNextNodeLink();
        }
        ++size;
    }
    public E retrieve(int index) {
        if (size <= index) throw new IllegalArgumentException("Single Linked List Retrieve Method was Passed an Invalid Index");
        else {
            SinglyLinkedListNode<E> current = head;
            for (int count = 0; count < index; count++) current = current.getNextNodeLink();
            return current.getElement();
        }
    }
    public E deleteFirst() {
        if (size == 0) return null;
        else {
            E firstElement = head.getElement();
            if (size == 1) {
                head = null;
                tail = null;
                size = 0;
            } else {
                head = head.getNextNodeLink();
                --size;
            }
            return firstElement;
        }
    }
}

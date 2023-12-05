public class SinglyLinkedListNode<E> {
    // instance variables
    private E element;
    SinglyLinkedListNode<E> nextNodeLink;
    
    // constructors
    public SinglyLinkedListNode(E element, SinglyLinkedListNode<E> nextNodeLink) {
        this.element = element;
        this.nextNodeLink = nextNodeLink;
    }
    
    // instance methods
    public E getElement() { return element; }
    public void setElement(E element) { this.element = element; }
    public SinglyLinkedListNode<E> getNextNodeLink() { return nextNodeLink; }
    public void setNextNodeLink(SinglyLinkedListNode<E> nextNodeLink) { this.nextNodeLink = nextNodeLink; }
}

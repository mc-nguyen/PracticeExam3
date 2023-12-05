public class QuinaryTreeNode<E> {
    // instance variables
    private E element;
    private QuinaryTreeNode<E> parent;
    private QuinaryTreeNode<E> childOne;
    private QuinaryTreeNode<E> childTwo;
    private QuinaryTreeNode<E> childThree;
    private QuinaryTreeNode<E> childFour;
    private QuinaryTreeNode<E> childFive;
    
    // constructor
    public QuinaryTreeNode(E element) { this.element = element; }
    
    // instance methods
    public E getElement() { return element; }
    public void setElement(E element) { this.element = element; }
    public QuinaryTreeNode<E> getParent() { return parent; }
    public QuinaryTreeNode<E> getChildOne() { return childOne; }
    public QuinaryTreeNode<E> getChildTwo() { return childTwo; }
    public QuinaryTreeNode<E> getChildThree() { return childThree; }
    public QuinaryTreeNode<E> getChildFour() { return childFour; }
    public QuinaryTreeNode<E> getChildFive() { return childFive; }
    public void setChildOne(QuinaryTreeNode<E> childOne) { this.childOne = childOne; }
    public void setChildTwo(QuinaryTreeNode<E> childTwo) { this.childTwo = childTwo; }
    public void setChildThree(QuinaryTreeNode<E> childThree) { this.childThree = childThree; }
    public void setChildFour(QuinaryTreeNode<E> childFour) { this.childFour = childFour; }
    public void setChildFive(QuinaryTreeNode<E> childFive) { this.childFive = childFive; }
}

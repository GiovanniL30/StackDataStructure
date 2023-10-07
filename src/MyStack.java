public class MyStack<T> implements Stack<T>{

    private int size = 0;
    private Node<T> top; // top or the tail
    private Node<T> head;


    public MyStack() {
        this.size = 0;
        this.top = null;
        this.head = null;
    }

    //Add at the end of the list
    @Override
    public void push(T data) throws StackException {

        if(data == null) throw new StackException("Inserting a value null");

        if(head == null || top == null) {
           head = top = new Node<>(data);
        }else {
            Node<T> newNode = new Node<>(data);
            top.setLink(newNode);
            top = newNode;
        }

        size++;
    }

    //Return the last Node
    @Override
    public T peek() {
        if(isEmpty()) throw  new StackException("Stack is Empty");

        return top.getData();
    }

    //Return and Delete the last Node
    @Override
    public T pop() throws  StackException {
        if(isEmpty()) throw  new StackException("Stack is Empty");

        Node<T> temp = new Node<>(top.getData());
        Node<T> current = head;

        while(current.getLink() != top) {
            current = current.getLink();
        }

        current.setLink(null);
        top = current;
        return temp.getData();
    }

    //Check is Size is 0
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //Returns the size
    @Override
    public int size() {
        return size;
    }


    //Returns the String representation of the Stack
    @Override
    public String toString() {
        String string = "";

        Node<T> current = head;

        while(current != null) {
            string += current.getData() + " ";
            current = current.getLink();
        }

        return "[" + string + "]";

    }
}

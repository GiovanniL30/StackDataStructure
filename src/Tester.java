public class Tester {

    public static void main(String[] args) {

        MyStack<String> myStack = new MyStack<>();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        System.out.println(myStack.pop());
        myStack.push("D");

        System.out.println(myStack.pop());

        System.out.println(myStack);

    }

}

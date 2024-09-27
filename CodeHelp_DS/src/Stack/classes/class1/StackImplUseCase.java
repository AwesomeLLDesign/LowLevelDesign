package Stack.classes.class1;

public class StackImplUseCase {
    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation(5);

        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(10);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(20);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(30);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(40);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(50);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.insertIntoStack(60);
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

        stackImplementation.popFromStack();
        stackImplementation.print();
        System.out.println("The stack top is : " + stackImplementation.getTop());
        System.out.println("The size is: " + stackImplementation.getSize());

    }
}

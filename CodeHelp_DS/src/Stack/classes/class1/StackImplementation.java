package Stack.classes.class1;

import java.util.Arrays;

public class StackImplementation {

    private int []stack;
    private int size = 0;
    int top = -1;

    public StackImplementation(int size){
        this.size = size;
        stack = new int[size];
        Arrays.fill(stack, -1);
    }

    public void insertIntoStack(int data){
        if (top < size - 1){
            top++;
            stack[top] = data;
        }else{
            System.out.println("Over flow : " + data);
        }
    }

    public void popFromStack(){
        System.out.println("Removing element from Stack");
        if (top == -1) System.out.println("Under Flow");
        else {
            stack[top] = -1;
            top--;
        }
    }

    public void print(){
        System.out.println("Printing Stack: ");
        for (int i = 0 ; i < size; i++){
            System.out.println(stack[i]);
        }
    }

    public int getTop(){
        return top;
    }

    public int getSize(){
        if (top == -1){
            return 0;
        }else{
            return top +1;
        }
    }

}

package algo.stack;

import lombok.ToString;

import java.util.*;

/**
 * Javadoc
 * @param <T>
 */
public class SetOfStacks<T> {
    private Stack<Stack<T>> stackList;
    private int stackCapacity;
    public SetOfStacks(int capacity){
        stackCapacity = capacity;
        stackList = new Stack<>();
        stackList.push(new Stack<>());
    }
    public void push(T item){
        Stack<T> lastStack = stackList.peek();
        if(lastStack.size < stackCapacity){
            lastStack.push(item);
            return;
        }
        lastStack = new Stack<>();
        lastStack.push(item);
        stackList.push(lastStack);
    }
    public T pop(){
        Stack<T> lastStack = stackList.peek();
        T item = lastStack.pop();
        if(lastStack.size <= 0){
            stackList.pop();
        }
        return item;
    }

    public T peek(){
        return stackList.peek().peek();
    }

    private static class Stack<T>{
        private StackNode<T> top;
        private int size = 0;
        private void push(T item){
            StackNode<T> node = new StackNode<>(item);
            node.next = top;
            top = node;
            size++;
        }

        private T pop(){
            if(top == null){
                throw new EmptyStackException();
            }
            T item = top.data;
            top = top.next;
            size--;
            return item;
        }

        private T peek(){
            return top.data;
        }

        private static class StackNode<T>{
            private T data;
            private StackNode next;
            private StackNode(T item){
                this.data = item;
            }
        }
    }


}

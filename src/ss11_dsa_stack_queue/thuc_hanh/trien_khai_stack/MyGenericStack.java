package ss11_dsa_stack_queue.thuc_hanh.trien_khai_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class MyGenericStack<T>{
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    boolean isEmpty() {
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}

import java.util.*;

class stackex{
    stackex(){
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(34);
        stack.push(56);

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.get(0));
        System.out.println(stack);
    }
}

public class ds {
    public static void main(String [] args){
        stackex a = new stackex();
    }
}

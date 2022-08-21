package ArrayList;

import java.util.ArrayList;

class MyStack {

    private ArrayList<String> arrayList = new ArrayList<>();

    public void push(String data){
        arrayList.add(data);
    }

    public String pop(){
        if(arrayList.size() == 0) {
            System.out.println("빈 스택");
            return null;
        }
        return arrayList.remove(arrayList.size() - 1);
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("D");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

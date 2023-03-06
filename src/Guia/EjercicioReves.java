package Guia;

import java.util.LinkedList;
import java.util.Stack;

public class EjercicioReves {
    public static void invertir( String text){
        LinkedList<String> list = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        StringBuilder stringReverse = new StringBuilder();
       for(int i = 0;i<text.length();i++){
           list.add(text.substring(i,i+1));

       }

       while(!list.isEmpty()){
           stack.push(list.pop());
       }

       while(!stack.isEmpty()){
           stringReverse.append(stack.pop());
       }
       System.out.println(stringReverse);
    }

    public static void main(String[] args) {
    invertir("La vida es bella");

    }
}

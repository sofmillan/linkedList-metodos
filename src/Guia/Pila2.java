package Guia;

import java.util.Stack;

public class Pila2 {

    public boolean estaBalanceado(String cadena){

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<cadena.length();i++){
            char c = cadena.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(c==')'||c==']'||c=='}'){
                if(stack.empty()){
                    return false;
                }
                char top = stack.peek();
                if((c==')'&&top=='(')||(c==']'&&top=='[')||(c=='}'&&top=='{')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();

    }

    public static void main(String[] args) {
        Pila2 pila2 = new Pila2();
        String cadena = "{[}]()";
        boolean estaBalanceado = pila2.estaBalanceado(cadena);
        System.out.println(estaBalanceado?"Balanceada":"No balanceada");
    }
}

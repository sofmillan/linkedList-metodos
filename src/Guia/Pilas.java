package Guia;

import java.util.Stack;

public class Pilas {

    public boolean esPalindromo(String cadena) {
        Stack<Character> stack = new Stack();
        int n = cadena.length();
        for(int i = 0;i<n/2;i++){
            stack.push(cadena.charAt(i));
        }

        for(int i=(n+1)/2;i<n;i++){
            if(stack.pop()!=cadena.charAt(i) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pilas pila = new Pilas();
        String cadena1 = "anitalavalatina";
        String cadena2 = "noespalindromo";
        String cadena3 = "ana";
        String cadena4 = "ojo";

        System.out.println("cadena 1 " + pila.esPalindromo(cadena1));
        System.out.println("cadena 2 " + pila.esPalindromo(cadena2));

    }
}

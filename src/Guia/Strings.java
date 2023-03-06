package Guia;

public class Strings {

    public static void invertirPalabra(String palabra){/*
        String palabrareves = "";
        for(int i = palabra.length();i>0;i--){
            palabrareves += palabra.charAt(i-1);
        }
        System.out.println(palabrareves);*/
        String [] array = palabra.split("");
        StringBuilder newText = new StringBuilder();
        for(int i = array.length;i>0;i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);
    }

    public static void esCapicua(int numero){
        String numberText = String.valueOf(numero);
        String reversaNumero = new StringBuilder(numberText).reverse().toString();
        if(numberText.equals(reversaNumero)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    public static void main(String[] args) {
       invertirPalabra("Ricky");

       StringBuilder newText = new StringBuilder("texto").reverse();
        System.out.println(newText);

        esCapicua(8888);
    }
}

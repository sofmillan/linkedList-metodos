package Guia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();

        palabras.add("hola");
        palabras.add("camion");
        palabras.add("planta");

        boolean contiene = palabras.contains("hola");

        palabras.remove("camion");

        int tamano = palabras.size();

        for(int i = 0;i<palabras.size();i++) {
            String palabra = palabras.get(i);
            System.out.println(palabra);
        }

        for(String palabra:palabras){
            System.out.println(palabra);
        }

        Iterator iterator = palabras.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

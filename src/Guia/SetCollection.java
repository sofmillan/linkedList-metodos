package Guia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> vocales = new HashSet<>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        vocales.add("A");

        for(Iterator<String> vocal= vocales.iterator();vocal.hasNext();) {
            String v = vocal.next();
            System.out.println(v);
        }

    }
}

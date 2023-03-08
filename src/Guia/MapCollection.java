package Guia;
import java.util.HashMap;
import java.util.Map;
public class MapCollection {
    public static void main(String[] args) {
     /*   Map<String, String > map = new HashMap<>();
        map.put("US","USA");
        map.put("BR","BRAZIL");
        map.put("COL","COLOMBIA");

        int tamano = map.size();
        String value = map.get("BR");
        System.out.println(value);
        map.remove("BR");

        boolean valor = map.containsValue("AFRICA");

        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/



        HashMap<String, String> data = new HashMap<>();
        data.put("123", "Keita");
        data.put("456", "Matty");


        HashMap<String, String> search = new HashMap<>();
        search.put("123", "Keita");

       boolean b = ifContains(data,search);
        System.out.println(b);
    }

    public static boolean ifContains(HashMap<String, String> data, HashMap<String, String> search) {
        for(String key:data.keySet()){
            if(search.containsKey(key) && search.get(key).equals(data.get(key))){
                return true;
            }
        }
        return false;
    }
}

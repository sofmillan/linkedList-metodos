package Ejercicios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapSesion {


    public static void main(String[] args) {
     /*  Implementa el control de acceso para una empresa de seguridad información . Se debe pedir
        un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el
        programa dirá "Ha accedido aceptado". El usuario tendrá un máximo de 4 oportunidades. Si se
        agotan las oportunidades el programa dirá "Lo siento, no tiene acceso al área restringida". Los
        nombres de usuario con sus correspondientes contraseñas que son permitidas deben estar
        almacenados en una estructura de la clase HasMap.*/

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> data = new HashMap<>();
        data.put("camilo","123");
        data.put("esteban1","18ff");
        data.put("matt","90k");

        int intentos = 4;
        while(intentos>0){

            System.out.println("Ingrese su usuario");
            String username = scan.nextLine();

            System.out.println("Ingrese su contraseña");
            String password = scan.nextLine();

            HashMap<String, String> search = new HashMap<>();
            search.put(username,password);

            if(ifcontains(data,search)){
                System.out.println("Ha accedido, aceptado");
                intentos=4;
                break;
            }else{
                intentos--;
                System.out.println("Datos incorrectos");
                System.out.println(intentos+" intentos restantes");

            }
        }
        if(intentos==0){
            System.out.println("Lo siento, no tiene acceso al área restringida");

        }



      /*  HashMap<String, String> data = new HashMap<>(data());
        HashMap<String, String> search = new HashMap<>(info());*/
     //   ifContains(data,search);

    }

    public static boolean ifcontains(HashMap<String, String> data, HashMap<String, String> search){
        for(String key:data.keySet()){
            if(search.containsKey(key) && search.get(key).equals(data.get(key))){
                return true;
            }
        }
        return false;
    }

}

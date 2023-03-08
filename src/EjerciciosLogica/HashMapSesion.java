package EjerciciosLogica;
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

        int attempts  = 4;
        while(attempts >0){

            System.out.println("Enter your username");
            String username = scan.nextLine();

            System.out.println("Enter your password");
            String password = scan.nextLine();

            HashMap<String, String> search = new HashMap<>();
            search.put(username,password);

            if(contains(data,search)){
                System.out.println("Accepted, you have access");
                attempts =4;
                break;
            }else{
                attempts --;
                System.out.println("Your login information was incorrect.");
                System.out.println(attempts +" remaining.");

            }
        }
        if(attempts==0){
            System.out.println("Sorry, you do not have access to restricted areas.");

        }

    }

    public static boolean contains(HashMap<String, String> data, HashMap<String, String> search){
        for(String key:data.keySet()){
            if(search.containsKey(key) && search.get(key).equals(data.get(key))){
                return true;
            }
        }
        return false;
    }

}

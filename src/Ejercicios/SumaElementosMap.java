package Ejercicios;

public class SumaElementosMap {
    public static void main(String[] args) {
        int [] array = {1,3,7};
        int k = 6;
        suma(array,k);
    }

    public static void suma(int[] array, int k){
        boolean  estadoActual = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int con =0;
                if(i!=j){
                    con = array[i]+array[j];
                }
                if(con==k){
                    estadoActual=true;
                    i=array.length+1;
                    break;
                }else{
                    estadoActual=false;
                }
            }
        }
        System.out.println(estadoActual?"Si":"No");
    }
}

package Ejercicios;

public class MaximaDiferencia {

    public static void main(String[] args) {
        /*
        Dado el array [15, 3, 6, 10], las diferencias que tiene son:
      */

        int[] array = {10,9,8,7,40,5,4};
        System.out.println(maximaDiferencia(array));
    }

    public static int maximaDiferencia(int[] array){
        int mayor=0, menor=array[0], diferente=0;
        int index=0;
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array.length;j++){
                if(array[j]>=mayor && i<j){
                    mayor = array[j];
                }
                if(array[j]<=menor ){
                    menor = array[j];
                    index=j;
                }
            }
        }

        for (int i = 0; i < array.length -1; i++) {
            if ((array[i]) > array[i+1]){
                diferente=-1;
            }else{
                diferente=0;
            }
        }
        return diferente==-1?diferente:mayor - menor;

    }
}

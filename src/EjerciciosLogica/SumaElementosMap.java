package EjerciciosLogica;

public class SumaElementosMap {
    public static void main(String[] args) {
        int [] array = {1,3,7};
        int k = 6;
        sum(array,k);
    }

    public static void sum(int[] array, int k){
        boolean  status = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int result =0;
                if(i!=j){
                    result = array[i]+array[j];
                }
                if(result==k){
                    status=true;
                    i=array.length+1;
                    break;
                }else{
                    status=false;
                }
            }
        }
        System.out.println(status?"Yes":"No");
    }
}

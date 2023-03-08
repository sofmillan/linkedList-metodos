package EjerciciosLogica;

public class MaximaDiferencia {

    public static void main(String[] args) {
        int[] array = {100,20,1};
        System.out.println(maxDifference(array));
    }

    public static int maxDifference(int[] array){
        int greaterNumber=0, smallerNumber=array[0], controller=0;
        int smallerNumberIndex=0;
        int greaterNumerIndex=0;
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array.length;j++){
                if(array[j]>=greaterNumber && i<j){
                    greaterNumber = array[j];
                    greaterNumerIndex=j;
                }
                smallerNumberIndex=j;
                if(array[j]<=smallerNumber && smallerNumberIndex<greaterNumerIndex){
                    smallerNumber = array[j];
                }
            }
        }

        for (int i = 0; i < array.length -1; i++) {
            if(smallerNumber>greaterNumber){
                controller=-1;
            }else
            if((array[i])==greaterNumber ){
                controller=0;
                break;
            }   else if ((array[i]) > array[i+1] ){
                controller=-1;
            } else{
                controller=0;
            }

        }
        return controller==-1?controller:greaterNumber - smallerNumber;

    }
}

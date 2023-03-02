package Ejercicios;

import java.util.Scanner;
public class MatrizEjercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma=0;

        System.out.println("Ingrese la cantidad de filas");
        int f = scan.nextInt();

        System.out.println("Ingrese la cantidad de columnas");
        int c = scan.nextInt();

        int matriz[][] = new int[f][c];
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Ingrese el número en las coordenadas "+i+"."+j);
                matriz[i][j] = scan.nextInt();
                suma+=matriz[i][j];
            }
        }

        System.out.println(suma);
    }
}

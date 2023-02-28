import java.util.Scanner;


public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double suma = 0.0;

        Double matriz[][] = new Double[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingresar el alumno número: "+f);
                matriz[f][c] = scan.nextDouble();
                suma += matriz[f][c];
            }
            matriz[f][3] = suma/3;
            suma = 0.0;
        }

        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno número: "+f+" son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota número "+c+" es: "+matriz[f][c]);
            }
            System.out.println("El promedio es "+matriz[f][3]);
        }
    }

}
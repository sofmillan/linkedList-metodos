package Ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueEjercicio {
    protected Queue<Cliente> fila;
    Scanner scan = new Scanner(System.in);
    int numeroTicket = 1;

    public QueueEjercicio() {
        this.fila = new LinkedList<>();
    }

    void addClient() {
        this.fila.add(new Cliente(numeroTicket));
        System.out.println("You've added the client "+numeroTicket);
        numeroTicket++;
    }
    void attendClient() {
        if(!this.fila.isEmpty()){
            Cliente actual = fila.peek();
            System.out.println("The client "+actual.id+" has been attended");
            fila.remove();
        }else{
            System.out.println("There are no clients");
        }

    }

    public void showMenu() {
        System.out.println("Select an option");
        System.out.println("1. Add client");
        System.out.println("2. Attend client");
        System.out.println("3. Exit");
    }
    public void actions() {
        char option = 'x';
        while (option != '3') {
            showMenu();
            option = scan.next().charAt(0);
            switch (option) {
                case '1':
                    addClient();
                    break;
                case '2':
                    attendClient();
                    break;
                case '3':
                    break;
                default:
                    System.out.println("Unvalid character");
                    break;
            }
        }

    }


    public static void main(String[] args) {
        QueueEjercicio queue = new QueueEjercicio();
        queue.actions();
    }

}

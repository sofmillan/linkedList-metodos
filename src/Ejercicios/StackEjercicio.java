package Ejercicios;
import java.util.Scanner;
import java.util.Stack;

public class StackEjercicio {
    Stack <String> users = new Stack<>();
    Scanner scan = new Scanner(System.in);
    public void connectUsers(){

        String userName;
        System.out.println("Do you want to connect a user?  1.yes  2.no");
       char option = scan.next().charAt(0);

        while(option=='1'){
                System.out.println("Type the user's name");
                userName= scan.next();
                users.push(userName);
            System.out.println("Do you want to connect a user?  1.yes  2.no");
            option = scan.next().charAt(0);
        }

        printUsers();

    }

    public void disconnectUser(){
        System.out.println("Do you wanna disconnect a user?  1.yes  2.no");
        char option = scan.next().charAt(0);
        while(option=='1'){
            if(users.isEmpty()){
                System.out.println("There are no users");
                break;
            }else{
                users.pop();
                printUsers();
            }
            System.out.println("Do you wanna disconnect users  1.yes  2.no");
             option = scan.next().charAt(0);
        }

    }

    public void printUsers(){
        System.out.println("USERS");
        users.forEach(System.out::println);
    }


    public static void main(String[] args) {
        StackEjercicio admin = new StackEjercicio();
        admin.connectUsers();
        admin.disconnectUser();
    }
}


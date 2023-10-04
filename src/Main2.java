import entities.Sim;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Inserisci il numero di telefono");
        long numeroDiTelefono1 = input.nextLong();


        System.out.println("Inserisci credito residuo");
        int creditoResiduo1 = input.nextInt();


        System.out.println("Inserisci credito residuo");
        String[] ultimeChiamate1 = {"Mamma,Nonna,fratello,sorella,padre"};


        Sim uno = new Sim(numeroDiTelefono1, creditoResiduo1, ultimeChiamate1);
        System.out.println(uno.getNumero() + " " + uno.getCredito() + "$   " + Arrays.toString(uno.getChiamate()));


        System.out.println("Inserisci il numero di telefono");
        long numeroDiTelefono2 = input.nextLong();
        Sim due = new Sim(numeroDiTelefono2);
        System.out.println(due.getNumero() + " " + due.getCredito() + "$   " + Arrays.toString(due.getChiamate()));


    }
}

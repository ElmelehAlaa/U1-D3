import entities.Rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero per l'altezza del rettangolo");
        int altezzaUno = input.nextInt();
        System.out.println("Inserisci un numero intero per la base del rettangolo");
        int baseUno = input.nextInt();
        Rettangolo uno = new Rettangolo(altezzaUno, baseUno);
        System.out.println("altezza= " + uno.getAltezza() + " base = " + uno.getBase());
        int area = uno.calcolaArea(altezzaUno, baseUno);
        int perimetro = uno.calcolaPerimetro(altezzaUno, baseUno);
        System.out.println("area= " + area + " perimetro = " + perimetro);

        System.out.println("Inserisci un numero intero per l'altezza del primo rettangolo");
        int altezzaDue = input.nextInt();
        System.out.println("Inserisci un numero intero per l'altezza del secondo rettangolo");
        int altezzaTre = input.nextInt();
        System.out.println("Inserisci un numero intero per la base del primo rettangolo");
        int baseDue = input.nextInt();
        System.out.println("Inserisci un numero intero per l'base del secondo rettangolo");
        int baseTre = input.nextInt();

        Rettangolo due = new Rettangolo(altezzaDue, baseDue);
        Rettangolo tre = new Rettangolo(altezzaTre, baseTre);
        System.out.println("Secondo Rettangolo: altezza= " + due.getAltezza() + " base = " + due.getBase() + " Terzo Rettangolo: altezza= " + tre.getAltezza() + " base = " + tre.getBase());
        int areaDue = due.calcolaArea(altezzaDue, baseDue);
        int areaTre = tre.calcolaArea(altezzaTre, baseTre);
        int perimetroDue = due.calcolaPerimetro(altezzaDue, baseDue);
        int perimetroTre = tre.calcolaPerimetro(altezzaTre, baseTre);
        int sommaAreePerimetro = Rettangolo.stampaDueRettangoli(areaDue, areaTre, perimetroDue, perimetroTre);

        System.out.println(" area secondo rettangolo= " + areaDue + " Area terzo rettangolo = " + areaTre + " Perimetro secondo rettangolo= " + perimetroDue + " Perimetro terzo rettangolo= " + perimetroTre);
        System.out.println("Somma aree e perimetri = " + sommaAreePerimetro);

    }
}
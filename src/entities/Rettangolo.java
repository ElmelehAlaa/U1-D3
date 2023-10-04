package entities;

public class Rettangolo {
    private int altezza;
    private int base;

    public Rettangolo(int altezza, int base) {
        this.altezza = altezza;
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setBase(int base) {
        if (base < 0) {
            System.out.println("La base deve essere un numero positivo");
        } else {
            this.base = base;
        }
    }

    public void setAltezza(int altezza) {
        if (altezza < 0) {
            System.out.println("L'altezza deve essere un numero positivo");
        } else {
            this.altezza = altezza;
        }
    }

    public int calcolaArea(int altezza, int base) {

        return (base * altezza);
    }

    public int calcolaPerimetro(int altezza, int base) {
        return (base * 2 + altezza * 2);
    }

    public static int stampaDueRettangoli(int areaDue, int areaTre, int perimetroDue, int perimetroTre) {
        int sommaArea = areaDue + areaTre;
        int sommaPerimetri = perimetroDue + perimetroTre;
        return (sommaPerimetri + sommaArea);
    }
}


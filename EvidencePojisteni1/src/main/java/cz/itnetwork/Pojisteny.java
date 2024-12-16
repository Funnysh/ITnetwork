package cz.itnetwork;

public class Pojisteny {

    //Atributy pojistěného
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    //Konstruktor
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "Jméno: " + this.jmeno + " " + this.prijmeni + " | Věk: " + this.vek + " | Telefonní číslo: " + this.telefonniCislo;
    }
}

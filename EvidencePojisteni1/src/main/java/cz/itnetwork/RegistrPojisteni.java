package cz.itnetwork;

import java.util.ArrayList;
import java.util.List;


public class RegistrPojisteni {

    //Seznam pojištěných
    private List<Pojisteny> seznamPojistenych;

    //Konstruktor pole
    public RegistrPojisteni() {
        seznamPojistenych = new ArrayList<>();
    }

    //Metoda na vytvoření pojištěného
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        Pojisteny novyPojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
        if (jmeno.isEmpty() || prijmeni.isEmpty()) {
            System.out.println("Je potřeba vyplnit vše!");
        }
        if (vek < 0) {
            System.out.println("Věk nemůže být záporný!");
        } else {
            seznamPojistenych.add(novyPojisteny);
            System.out.println("Uživatel uložen!");
        }
    }

    //Metoda na vypsání všech pojištěných ze sezanmu pojištěných
    public void vypisVsechnyPojistene() {
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println(pojisteny);
        }
    }

    //Metoda na vyhledání uživatele podle jména a příjmení
    public void najdiPojistenehoPodleJmena(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                System.out.println("Nalezený pojištěný: ");
                System.out.println(pojisteny);
                return;
            }
        }
        System.out.println("Pojištění nebyl nalezen");
    }
}

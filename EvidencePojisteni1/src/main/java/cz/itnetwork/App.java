package cz.itnetwork;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Vytvoření skenereu
        Scanner scanner = new Scanner(System.in);

        //Vytvoření registru
        RegistrPojisteni registr = new RegistrPojisteni();

        //Spuštění aplikace
        boolean spusteno = true;

        while (spusteno) {

            //Výběr akce
            System.out.println("----------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("----------------------");
            System.out.println("Vyberte akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");

            //Vyhodnocení akce
            String vstup = scanner.nextLine();
            switch (vstup) {
                case "1":
                    System.out.println("Zadejte jméno: ");
                    String jmeno = scanner.nextLine();

                    System.out.println("Zadejte příjmení: ");
                    String prijmeni = scanner.nextLine();

                    System.out.println("Zadejte věk: ");
                    int vek = Integer.parseInt(scanner.nextLine());

                    System.out.println("Zadejte telefonní číslo s předvolbou: ");
                    String telefonniCislo = scanner.nextLine();

                    registr.vytvorPojisteneho(jmeno, prijmeni, vek, telefonniCislo);

                    break;
                case "2":
                    registr.vypisVsechnyPojistene();

                    break;
                case "3":
                    System.out.println("Jméno hledaného: ");
                    String jmenoHledaneho = scanner.nextLine();

                    System.out.println("Příjmení hledaného: ");
                    String prijmenihledaneho = scanner.nextLine();

                    registr.najdiPojistenehoPodleJmena(jmenoHledaneho, prijmenihledaneho);

                    break;
                case "4":
                    spusteno = !spusteno;

                    break;
            }
        }
        System.out.println("Děkujeme za použití!");
    }
}
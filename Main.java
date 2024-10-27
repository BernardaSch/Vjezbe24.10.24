
/*
2. Telefonski imenik:
Napravi program koji simulira telefonski imenik koristeći dvije paralelne liste:
Lista u koju se spremaju imena, i lista u kojoj se sprema brojevi
Kod prvog odabira korisnik unosi ime i broj koji se spremaju u svoje liste
Korisnik ima mogucnost odabira, te za svaki odabir treba omoguciti odredenu funkcionalnost sa slike.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<String> imena = new ArrayList<>();
    static List<String> brojevi = new ArrayList<>();
    static int odabir;

    public static void main(String[] args) {

        System.out.println("\n***** Odaberite opciju: *****");

        do {
            System.out.println("\n1. Dodaj kontakt ");
            System.out.println("2. Pretraži po imenu ");
            System.out.println("3. Pretraži po broju ");
            System.out.println("4. Izbriši sve ");
            System.out.println("\n");

            odabir = scanner.nextInt();
            scanner.nextLine();

            switch (odabir){
                case 1:
                    dodavanjeKontakta();
                    break;
                case 2:
                    pretrazivanjePoImenu();
                    break;
                case 3:
                    pretrazivanjePoBroju();
                    break;
                case 4:
                    izbrisiSve();
                    break;
                default:
                    System.out.println("Krivi odabir. Pokušajte ponovno.");
                    break;
            }
        }while(odabir == 1 || odabir == 2 || odabir == 3 || odabir == 4);
    }

    private static void dodavanjeKontakta(){
        System.out.println("Unesite ime i prezime: ");
        String imeIPrezime = scanner.nextLine();

        System.out.println("Unesite telefonski broj: ");
        String telBroj = scanner.nextLine();

        imena.add(imeIPrezime);
        brojevi.add(telBroj);
        System.out.println("Kontakt je unesen.");
    }

    private static void pretrazivanjePoImenu(){
        System.out.println("Unesite ime ili prezime ");
        String imeZaPretragu = scanner.nextLine();

        int i = imena.indexOf(imeZaPretragu);
        if (i != -1) {
            System.out.println("Pronađeni podaci: " + imena.get(i) + " " + brojevi.get(i));
        } else {
            System.out.println("Podaci nisu pronađeni.");
        }
    }

    private static void pretrazivanjePoBroju() {
        System.out.print("Unesite broj za pretragu: ");
        String brojZaPretragu = scanner.nextLine();

        int i = brojevi.indexOf(brojZaPretragu);
        if (i != -1) {
            System.out.println("Pronađeni kontakt: " + imena.get(i) + "  " + brojevi.get(i));
        } else {
            System.out.println("Podaci nisu pronađeni.");
        }
    }

    private static void izbrisiSve() {
        imena.clear();
        brojevi.clear();
        System.out.println("Obrisano.");
    }
}
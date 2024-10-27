/*
Statistika riječi
Napravi program koji učitava rečenicu i ispisuje:
Sve riječi duže od 5 slova
Najdužu riječ
Prosječnu duljinu riječi
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> rijeciDuzeOdPetSlova =  new ArrayList<>();

        int brojSlova = 0;
        int ukupnaDuljinaSvihRijeciURecenici = 0;
        String najduzaRijec = "";
        double prosjek = 0;
        String recenica = "";

        System.out.println("Unesite rečenicu: ");
        recenica = scanner.nextLine();

        String[] rijeci = recenica.split("\\s+");

        for (String rijec : rijeci){
            brojSlova=rijec.length();
            ukupnaDuljinaSvihRijeciURecenici = ukupnaDuljinaSvihRijeciURecenici + brojSlova;

            if (brojSlova>5) {
                rijeciDuzeOdPetSlova.add(rijec);
            }

            if (brojSlova > najduzaRijec.length()){
                najduzaRijec = rijec;
            }

        }
        prosjek =  (double)ukupnaDuljinaSvihRijeciURecenici / rijeci.length;

        System.out.println("Riječi duže od pet slova: " + rijeciDuzeOdPetSlova);
        System.out.println("Najduža riječ: " + najduzaRijec);
        System.out.println("Prosjek duljine svih riječi: " + prosjek);

    }
}

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    // Tražimo unos iznosa od korisnika
        System.out.print("Unesite iznos koji treba vratiti: ");
    double iznos = scanner.nextDouble();

    // Definiranje dostupnih apoena
    double[] apoeni = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    int[] brojNovcanica = new int[apoeni.length]; // spremamo broj svake novčanice/kovanice

    // Izračunavanje koliko novčanica i kovanica je potrebno
        for (int i = 0; i < apoeni.length; i++) {
        if (iznos >= apoeni[i]) {
            brojNovcanica[i] = (int) (iznos / apoeni[i]);
            iznos -= brojNovcanica[i] * apoeni[i];
            iznos = Math.round(iznos * 100.0) / 100.0; // zaokruživanje zbog grešaka u decimalama
        }
    }

    // Ispis rezultata
        System.out.println("Povrat novca:");
        for (int i = 0; i < apoeni.length; i++) {
        if (brojNovcanica[i] > 0) {
            System.out.println(brojNovcanica[i] + " x " + apoeni[i] + " HRK");
        }
    }
    }
    }
}
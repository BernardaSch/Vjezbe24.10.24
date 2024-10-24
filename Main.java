/*napraviti funkciju koja će rovjeravati da li je lista uzlazno sortirana.
prethodno, listu popunjava korisnik svojim unosima.
funkcija treba vratiti true ili false.
na kraju programa korisniku ispisati da li je lista sortirana ili nije.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaBrojeva = new ArrayList<>();
        System.out.println("******** Unos 5 brojeva u listu ********** ");

        for (int i=0; i<5; i++){
            System.out.println("Unesite " + (i+1) + ". broj u listu: ");
            listaBrojeva.add(scanner.nextInt());
        }

        if (jeLiListaSortirana(listaBrojeva)){
            System.out.print("Lista je uzlazno sortirana: ");
            System.out.println(listaBrojeva);
        }
        else{
            System.out.print("Lista nije uzlazno sortirana: ");
            System.out.println(listaBrojeva);
        }
    }

    private static Boolean jeLiListaSortirana(List<Integer> listaBrojeva){
        for (int i=0; i< listaBrojeva.size()-1;i++){
            if (listaBrojeva.get(i) > listaBrojeva.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
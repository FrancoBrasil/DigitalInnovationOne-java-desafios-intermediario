package comprasNoSupermercado;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1º lista ");
        String firstEntry = sc.nextLine();

        String[] splitFirstEntry = firstEntry.split(" ");

        for (int i = 0; i < splitFirstEntry.length; i++) {
            treeSet1.add(splitFirstEntry[i]);
        }

        System.out.print("Digite a 2º lista ");
        String secondEntry = sc.nextLine();

        String[] splitSecondEntry = secondEntry.split(" ");

        for (int i = 0; i < splitSecondEntry.length; i++) {
            treeSet2.add(splitSecondEntry[i]);
        }

        for (String n : treeSet1) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String n : treeSet2) {
            System.out.print(n + " ");
        }

        sc.close();

    }
}

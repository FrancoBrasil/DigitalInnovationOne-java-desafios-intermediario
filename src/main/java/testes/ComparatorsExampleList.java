package testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("qtde: ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            Estudante e = new Estudante(nome, idade);
            estudantes.add(e);
        }

        System.out.println("Ordem de Inserção");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("Ordem natural dos números - idade (interface Comparable)");
        System.out.println(estudantes);

        sc.close();
    }
}

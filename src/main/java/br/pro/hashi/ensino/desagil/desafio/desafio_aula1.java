package br.pro.hashi.ensino.desagil.desafio;

import java.util.Scanner;

public class desafio_aula1 {
    public static void main(String[] args) {
        System.out.println("Idade: ");

        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        scanner.close();

        System.out.print("Fase da vida: ");

        if (idade <= 11) {
            System.out.println("criança");
        } else if (idade <= 17) {
            System.out.println("adolescente");
        } else {
            System.out.println("adulto");
        }
    }
}

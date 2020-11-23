package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes = inputMes(sc);

        switch (mes) {
            case 2 -> {
                System.out.println("Digite o ano: ");
                int ano = sc.nextInt();
                if (verificaAnoBisexto(ano)) {
                    exibeResultado(29);
                } else {
                    exibeResultado(28);
                }
            }
            case 4, 6, 9, 11 -> exibeResultado(30);
            default -> exibeResultado(31);
        }
    }

    private static boolean verificaAnoBisexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else {
            return ano % 4 == 0 && ano % 100 != 0;
        }
    }

    private static int inputMes(Scanner sc) {
        System.out.println("Digite o mês: ");
        for (; ; ) {
            if (!sc.hasNextInt()) {
                System.out.println("É necessário inserir um número");
            } else {
                int mes = sc.nextInt();
                if (mes >= 1 && mes <= 12)
                    return mes;
                System.out.println("Mês inválido");
            }
            sc.nextLine();
        }
    }

    private static void exibeResultado(int dias) {
        System.out.printf("O mês possui %s dias", dias);
    }
}

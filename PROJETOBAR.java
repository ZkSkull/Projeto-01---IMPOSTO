package projetoBAR;

import java.util.Scanner;

public class PROJETOBAR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        int qtdCervejas = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        int qtdRefrigerantes = scanner.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        int qtdEspetinhos = scanner.nextInt();

        // Definindo o valor do ingresso
        double ingresso;
        if (sexo == 'F' || sexo == 'f') {
            ingresso = 8.0;
        } else {
            ingresso = 10.0;
        }

        // Calculando o consumo
        double valorCervejas = qtdCervejas * 5.0;
        double valorRefrigerantes = qtdRefrigerantes * 3.0;
        double valorEspetinhos = qtdEspetinhos * 7.0;
        double consumo = valorCervejas + valorRefrigerantes + valorEspetinhos;

        // Calculando o couvert artístico
        double couvert = 4.0;
        if (consumo > 30.0) {
            couvert = 0.0; // Isento de couvert se o consumo for maior que 30
        }

        // Cálculo final
        double valorTotal = consumo + ingresso + couvert;

        // Saída - Relatório da conta
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", consumo);
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f\n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

        scanner.close();
    }
}

package br.uniesp.POO.Aula03;
import java.util.Scanner;

public class Desafio {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome completo:");
        String nomeCompleto = sc.nextLine();
        System.out.println("Digite o nome curso:");
        String nomeCurso = sc.nextLine();
        System.out.println("Digite o o número do período:");
        int numeroPeriodo = sc.nextInt();
        System.out.println("Digite a primeira nota:");
        float primeiraNota = sc.nextFloat();
        System.out.println("Digite a segunda nota:");
        float segundaNota = sc.nextFloat();
        System.out.println("Digite a quantidade de faltas:");
        int faltas = sc.nextInt();

        float media = (primeiraNota+segundaNota)/2;

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome do curso: " +nomeCurso);
        System.out.println("Período: " +numeroPeriodo);
        System.out.println("Primeira nota: " +primeiraNota);
        System.out.println("Segunda nota: " +segundaNota);
        System.out.println("Quantiade de faltas: " +faltas);

        System.out.println("A média das notas é:" + media);
    }
}

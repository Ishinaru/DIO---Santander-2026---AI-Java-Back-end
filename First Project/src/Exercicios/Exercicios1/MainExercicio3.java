package Exercicios.Exercicios1;

import java.util.Scanner;
/*
    3 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área 
    e exiba na tela.
    fórmula: área = base*altura 
*/

public class MainExercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        int base = scanner.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int height = scanner.nextInt();
        System.out.printf("A área do retângulo é %d .", height * base);
        scanner.close();        
    }
}

package Exercicios.Exercicios1;

import java.util.Scanner;

/*
    2 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
    fórmula: área = lado*lado 
*/
public class MainExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Insira o tamanho do lado do quadrado: ");
        int lado = scanner.nextInt();
        System.out.printf("A área do quadrado é de %d.", lado*lado);
        scanner.close();
    }
}

package Exercicios.Exercicios2;
/*
    1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número; 
*/

import java.util.Scanner;

public class MainExercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        var number = scanner.nextInt();
        System.out.println("============================================");
        System.out.printf("\tTabuada de 1 até 10 do número %d:\n", number);
        System.out.println("============================================");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("\t\t" + i + "*" + number + " = " + number*i);
        }
        scanner.close();
    }

}

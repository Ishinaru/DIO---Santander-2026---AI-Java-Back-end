package Exercicios.Exercicios2;
/*
    3. Escreva um código que o usuário entre com um primeiro número, 
    um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
    com isso o código deve informar todos os números pares ou ímpares 
    (de acordo com a seleção inicial) no intervalo de números informados, 
    incluindo os números informados e em ordem decrescente;
*/

import java.util.Scanner;

public class MainExercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int number1 = scanner.nextInt();
        System.out.print("Insira o segundo número (deve ser maior que o primeiro): ");
        int number2 = scanner.nextInt();
        while (number2 <= number1) {
            System.out.print("O número informado é menor ou igual ao primeiro, insira novamente: ");
            number2 = scanner.nextInt();
        }
        System.out.print("Digite (1) para escolher os pares ou (0) para escolher os ímpares: ");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 0) {
            System.out.print("O número informado é inválido! Digite (1) para escolher os pares ou (0) para escolher os ímpares: ");
            choice = scanner.nextInt();
        }
        if (choice == 1) {
            System.out.println("Imprimindo os pares entre " + number1 + " e " + number2 + ": \n");
            for(int i = number2; i >= number1; i--)
            {
                if(i%2 == 0)
                    System.out.println(i);
            }
        }
        else{
            System.out.println("Imprimindo os ímpares entre " + number1 + " e " + number2 + ": \n");
            for(int i = number2; i >= number1; i--)
            {
                if (i%2 != 0 && i != 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}

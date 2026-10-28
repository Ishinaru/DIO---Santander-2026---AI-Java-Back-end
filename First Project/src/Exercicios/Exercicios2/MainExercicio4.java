package Exercicios.Exercicios2;

import java.util.Scanner;

/*
    4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
    a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente 
    de  0 na divisão, números menores que o primeiro número devem ser ignorados
*/
public class MainExercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número inicial: ");
        var number = scanner.nextInt();
        int N;
        int divisionRest;
        do{
            System.out.print("Informe outro número: ");
            N = scanner.nextInt();
            while(N <= number)
            {
                System.out.print("Informe um número maior que " + number + ": ");
                N = scanner.nextInt();
            }
            divisionRest = N % number; 
            System.out.printf("%d %% %d = %d\n", N, number, divisionRest);
        }while(divisionRest == 0);

        scanner.close();
    }
}

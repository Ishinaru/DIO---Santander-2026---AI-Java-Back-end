package Exercicios.Exercicios1;

import java.util.Scanner;
import java.time.LocalDate;

/*
    1 - Escreva um código que receba o nome e o ano de nascimento de alguém
    e imprima na tela a seguinte mensagem: "Olá 'Fulano' você  tem 'X' anos de idade." 
*/
public class MainExercicio1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        LocalDate todayDate = LocalDate.now();
        System.out.print("Informe seu nome: ");
        var name = scan.next();
        System.out.print("Digite seu ano de nascimento: ");
        var birthYear = scan.nextInt();
        var age = todayDate.getYear() - birthYear;
        System.out.printf("Olá %s, você tem %s anos de idade.", name, age);
    }
}

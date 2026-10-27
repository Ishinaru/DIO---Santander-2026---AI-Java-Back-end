package Exercicios.Exercicios1;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
    4 - Escreva um código que o nome e a idade de duas pessoas e imprima a diferença de 
    idade entre elas. 
*/
public class MainExercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Insira o nome da pessoa 1: ");
        String namePerson1 = scanner.nextLine();
        System.out.print("Insira a data de nascimento da pessoa 1 (dd/MM/yyyy): ");
        String dateOfBirthPerson1String = scanner.nextLine();
        LocalDate dateOfBirthPerson1 = LocalDate.parse(dateOfBirthPerson1String, formatter);
        System.out.print("Insira o nome da pessoa 2: ");
        String namePerson2 = scanner.nextLine();
        System.out.print("Insira a data de nascimento da pessoa 2 (dd/MM/yyyy): ");
        String dateOfBirthPerson2String = scanner.nextLine();
        LocalDate dateOfBirthPerson2 = LocalDate.parse(dateOfBirthPerson2String, formatter);

        Period period = Period.between(dateOfBirthPerson1, dateOfBirthPerson2).normalized();
        int differenceOfDays = Math.abs(period.getDays());
        int differenceOfMonths = Math.abs(period.getMonths());
        int differenceOfYears = Math.abs(period.getYears());
        System.out.printf("A diferença de idade entre %s e %s é de %d dias %d meses e %d anos.", namePerson1, namePerson2, differenceOfDays, differenceOfMonths, differenceOfYears);

        scanner.close();
    }
}

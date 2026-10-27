package Exercicios.Exercicios2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC
    (IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/
public class MainExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu peso: ");
        double weight = scanner.nextDouble();
        System.out.print("Insira sua altura: ");
        double height = scanner.nextDouble();
        var imcDecimal = weight / (height * height);
        BigDecimal bd = BigDecimal.valueOf(imcDecimal);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double imc = bd.doubleValue();
        String message = "";

        if (imc <= 18.5) {
            message = "Abaixo do peso";
        }
        else if (imc <= 24.9) {
            message = "Peso ideal"; 
        }
        else if (imc <= 29.9) {
            message = "Levemente acima do peso";
        }
        else if (imc <= 34.9) {
            message = "Obesidade Grau I";
        }
        else if (imc <= 39.9) {
            message = "Obesidade Grau II (Severa)";
        }
        else
            message = "Obesidade Grau III (Mórbida)";
        scanner.close();

        System.out.println("IMC = " + imc + ", " + message);
    }
}

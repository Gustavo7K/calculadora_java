package calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        try {
            System.out.println(" Olá bem vindo(a) a calculadora de operaçoes basicas:");
            Scanner scanner = (new Scanner(System.in)).useLocale(Locale.FRANCE);
            System.out.println("Agora digite o primeiro numero: ");
            double primeiroNumero = scanner.nextDouble();
            System.out.println("Digite o simbolo da operação matematica que deseja fazer: (x, +, -, %, /) ");
            String operador = scanner.next();
            System.out.println("Digite o segundo numero: ");
            double segundoNumero = scanner.nextDouble();
            double resultado;
            if (!Objects.equals(operador, "X") && !Objects.equals(operador, "x")) {
                if (Objects.equals(operador, "+")) {
                    resultado = primeiroNumero + segundoNumero;
                    System.out.println("Soma: " + primeiroNumero + " + " + segundoNumero + " = " + resultado);
                } else if (Objects.equals(operador, "-")) {
                    resultado = primeiroNumero - segundoNumero;
                    System.out.println("Subtração: " + primeiroNumero + " - " + segundoNumero + " = " + resultado);
                } else if (Objects.equals(operador, "/")) {
                    resultado = primeiroNumero - segundoNumero;
                    System.out.println("Divisão: " + primeiroNumero + " / " + segundoNumero + " = " + resultado);
                } else if (Objects.equals(operador, "%")) {
                    resultado = primeiroNumero % segundoNumero;
                    System.out.println("Resto da divisão: " + primeiroNumero + " % " + segundoNumero + " = " + resultado);
                }
            } else {
                resultado = primeiroNumero * segundoNumero;
                System.out.println("Multiplicação: " + primeiroNumero + " x " + segundoNumero + " = " + resultado);
            }
            scanner.close();
        } catch (InputMismatchException var9) {
             System.out.println("Erro! Digite somente números e o símbolo da operação desejada exemplo: x, +, -, %, /");
        }
    }
}
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner objscan0 = new Scanner(System.in);
        while (true) {
            System.out.printf("Digite um numero qualquer para usar a calculadora ou 'x' para sair): ");
            String input = objscan0.next();

            if (input.equals("x")) {
                System.out.println("Calculadora desligada.");
                break;
            }


            Scanner objscan1 = new Scanner(System.in);
            System.out.printf("Digite um numero: ");

            double num1;
            num1 = objscan1.nextDouble();


            Scanner objscan3 = new Scanner(System.in);
            System.out.printf("escolha a operacao que deseja realizar +|-|*|/: ");

            String operacao;
            operacao = objscan3.next();


            Scanner objscan2 = new Scanner(System.in);
            System.out.printf("Digite outro numero: ");

            double num2;
            num2 = objscan2.nextDouble();


            if (operacao.equals("+")) {
                double resultado = num1 + num2;
                System.out.println("O resultado da soma dos numeros escolhidos é: " + resultado);
            } else if (operacao.equals("-")) {
                double resultado = num1 - num2;
                System.out.println("O resultado da subtracao dos numeros escolhidos é: " + resultado);
            } else if (operacao.equals("*")) {
                double resultado = num1 * num2;
                System.out.println("O resultado da multiplicacao dos numeros escolhidos é: " + resultado);
            } else if (operacao.equals("/")) {
                double resultado = num1 / num2;
                System.out.println("O resultado da divisao dos numeros escolhidos é: " + resultado);
            } else {
                System.out.println("Operacao invalida");
            }

        }
    }
}

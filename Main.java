import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite um numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double numero2 = sc.nextDouble();

        // Polimorfismo: variável da superclasse aponta para a subclasse
        Calculadora calc = new CalculadoraSimples(numero1, numero2);

        System.out.println("Escolha a operação: (+, -, *, /)");
        String op = sc.next();

        double resultado = 0;

        // Seleção dinâmica do método conforme a entrada do usuário
        switch (op) {
            case "+":
                resultado = calc.somar();
                break;
            case "-":
                resultado = calc.subtrair();
                break;
            case "*":
                resultado = calc.multiplicar();
                break;
            case "/":
                resultado = calc.dividir();
                break;
            default:
                System.out.println("Operação inválida.");
                sc.close();
                return;
        }

        // Resultado exibido
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
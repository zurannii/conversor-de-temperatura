import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Conversor de Temperatura");
        System.out.println("Escolha uma Opção para conveter: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("A temperatura em Farenheit é:" + fahrenheit);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é:" + celsius);
        } else if (opcao == 3) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double kelvin = celsius + 273.15;
            System.out.println("A temperatura em Kelvin é:" + kelvin);
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}

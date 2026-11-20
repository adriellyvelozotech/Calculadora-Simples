import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nSeja bem-vindo à Calculadora Digital!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Somar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Dividir");
            System.out.println("4. Subtrair");
            System.out.println("5. Sair");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Informe o primeiro valor: ");
                int valor1 = sc.nextInt();

                System.out.print("Informe o segundo valor: ");
                int valor2 = sc.nextInt();

                switch (opcao) {

                    case 1:
                        int soma = valor1 + valor2;
                        System.out.println("Resultado: " + soma);
                        break;

                    case 2:
                        int multiplicar = valor1 * valor2;
                        System.out.println("Resultado: " + multiplicar);
                        break;

                    case 3:
                        if (valor2 != 0) {
                            double dividir = (double) valor1 / valor2;
                            System.out.println("Resultado: " + dividir);
                        } else {
                            System.out.println("Não é possível dividir por zero!");
                        }
                        break;

                    case 4:
                        int subtrair = valor1 - valor2;
                        System.out.println("Resultado: " + subtrair);
                        break;
                }

            } else if (opcao == 5) {
                System.out.println("Calculadora encerrada. Até mais!");
            } else {
                System.out.println("Escolha uma opção válida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}

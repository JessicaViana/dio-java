import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // try-with-resources
        // Cria uma instância da classe Scanner para ler a entrada do usuário
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita o nome do cliente
            System.out.println("Por favor, digite seu nome:");
            String cliente = scanner.next();

            // Solicita o número da agência
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            // Solicita o número da conta
            System.out.println("Por favor, digite o número da sua conta:");
            int numero = scanner.nextInt();

            // Solicita o valor do depósito inicial
            System.out.println("Por favor, digite o quanto deseja depositar:");
            double saldo = scanner.nextDouble();

            // Exibe a mensagem de confirmação da criação da conta
            String output = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.",
                    cliente, agencia, numero, saldo
            );
            System.out.println(output);

        }
    }
}

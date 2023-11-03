import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //mensagem de boas vindas
        System.out.println("Olá, seja bem vindo ao banco.");
        System.out.println("Por favor, inserir os dados solicitados abaixo para a criação da conta.\n");

        //pegando as informações do cliente
        System.out.println("Por favor, digite o número da agência !");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        numero = input.nextInt();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + "\n já está disponível para saque");
        input.close();
    }
}

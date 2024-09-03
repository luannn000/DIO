import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaBanco conta = new ContaBanco();

        System.out.println("Insira o número da conta: ");
        conta.numero = scanner.nextInt();

        System.out.println("Insira a agência: ");
        conta.agencia = scanner.next();

        System.out.println("Insira o nome do cliente: ");
        conta.nomeCliente = scanner.next();

        System.out.println("Insira o saldo do cliente: ");
        conta.saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + conta.nomeCliente
                        + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia
                        + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");

        scanner.close();
    }
}

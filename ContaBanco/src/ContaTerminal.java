import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite sua agência: ");
        String agencia = scan.nextLine();
        System.out.println("Digite sua conta: ");
        int conta = scan.nextInt();
        System.out.println("Digite seu saldo: ");
        double saldo = scan.nextDouble();
        scan.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f ", nome,agencia,conta,saldo);
    }
}

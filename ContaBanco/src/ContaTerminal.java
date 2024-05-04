import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia;
        String nomeDoCliente;
        float saldo = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\n---CADASTRO---\n");
        System.out.println("Digite o numero da agencia: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeDoCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " reais já está disponível para saque");
    }
}

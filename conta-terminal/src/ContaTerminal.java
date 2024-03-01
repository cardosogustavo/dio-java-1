import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criando scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o seu nome:");
        String nome_cliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome_cliente = scanner.next();
        
        System.out.println("Digite o número da sua Agência:");
        String agencia_conta = scanner.next();
        
        System.out.println("Digite o número da sua conta:");
        int numero_conta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + " " +  sobrenome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia_conta + ", conta " + numero_conta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}

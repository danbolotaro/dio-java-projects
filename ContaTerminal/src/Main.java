import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite sua agência: ");
        var agency = scanner.next();
        System.out.println("Digite o número da conta: ");
        var account = scanner.next();
        System.out.println("Digite seu saldo: ");
        var balance = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, e seu saldo %s já está disponível para saque", name, agency, account, balance);
    }

}
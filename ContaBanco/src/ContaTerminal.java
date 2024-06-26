import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal { 
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();
    
        System.out.println("Digite o número da sua conta: ");
        int contaCliente = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do depósito:");
        double deposito = scanner.nextDouble();

        double saldo =  100.00;

        saldo +=deposito;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + contaCliente + " e o seu saldo atualizado " + saldo + " já está disponível para saque.");
       
        scanner.close();
    }
        catch (InputMismatchException e) {
        }
    }
}

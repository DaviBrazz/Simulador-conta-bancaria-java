
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));
       
        Conta conta = new Conta();
        Boolean rodando = true;

        System.out.println(" -------------- ENTRE COM OS DADOS DA CONTA --------------");
        System.out.print(" Nº da conta: ");
        int nConta = sc.nextInt();
        sc.nextLine();

        System.out.print(" Agência: ");
        String agencia = sc.nextLine();

        System.out.print(" Nome: ");
        String nome = sc.nextLine();

        conta.setNumero(nConta);
        conta.setAgencia(agencia);
        conta.setNomeCliente(nome);

        System.out.println(" Seja bem vindo, " + conta.getNomeCliente() + " sua conta de número " + conta.getNumero()
                + " e Agência " + conta.getAgencia() + " ainda não possui saldo, por valor insira um valor");
        System.out.print(" Valor para depositar: R$ ");
        double valorInicial = sc.nextDouble();
        conta.setSaldo(valorInicial);
        System.out.println(" Agradecemos a colaboração");
        System.out.println(" Carregando opções...");
        System.out.println();

        while (rodando) {

            System.out.println(" -------------- SELECIONE A OPÇÃO DESEJADA --------------");
            System.out.println();
            System.out.println(" --------------      (1) Depósito          --------------");
            System.out.println(" --------------      (2) Saque             --------------");
            System.out.println(" --------------      (3) Consultar Saldo   --------------");
            System.out.println(" --------------      (0) Finalizar         --------------");
            System.out.println();

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor para depósito");
                    System.out.println();
                    System.out.print("Valor: R$ ");
                    Double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Insira o valor para saque");
                    System.out.println();
                    System.out.print("Valor: R$ ");
                    Double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.consultarSaldo();
                    break;

                case 0:
                    rodando = false;
                    break;
                default:
                    System.out.println("Operação encerrada");
            }
            
        }
        sc.close();
    }

}

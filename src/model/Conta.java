public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Conta(){

    }

    public Conta(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }


    // ------------- MÉTODOS PARA REALIZAR OPERAÇÕES BANCÁRIAS -------------

    public   void depositar(Double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso");
    }


    public  void sacar(Double valor) {
        if (valor > getSaldo()) {
            System.out.printf("ALERTA! Valor em conta: R$ %.2f%n", getSaldo());
            System.out.println("Você não possui saldo suficiente");
       } else {
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso");
       }
   }

   public void consultarSaldo() {
    System.out.printf("Seu saldo atual é: R$ %.2f%n", getSaldo());
   }
}


public class Banco {
    private String titular;
    private String numero;
    private int agencia;
    private String tipo;
    private double saldo;

    public Banco(String titular, String numero, int agencia, String tipo, float saldo) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;

        switch(tipo.toLowerCase()) {
            case "simples":
                this.tipo = "simples";
                break;
            case "vip":
                if (saldo > 0) {
                    this.tipo = "vip";
                } else {
                    this.tipo = "simples";
                    System.out.println("Conta VIP necessita de depósito inicial! Definido como simples por padrão.");
                }
                break;
            default:
                this.tipo = "simples";
                System.out.println("Tipo de conta inválido! Definido como simples por padrão.");
                break;
        }

        this.saldo = saldo;
        System.out.println(String.format("Sr(a) %s, sua conta %s foi criada com sucesso!", this.titular, this.tipo));
    }

    public Banco(String titular, String numero, int agencia, String tipo) {
        this(titular, numero, agencia, tipo, 0);
    }

    public double depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        return this.saldo;
    }

    public double sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return this.saldo;
    }
    
    public void obterInformacoesDaConta() {
        System.out.println(
            String.format(
                "Nome do titular: %s",
                this.titular
            )
        );
        System.out.println(
            String.format(
                "Número da conta: %s",
                this.numero
            )
        );
        System.out.println(
            String.format(
                "Agência: %d",
                this.agencia
            )
        );
        System.out.println(
            String.format(
                "Tipo da conta: %s",
                this.tipo
            )
        );
        System.out.println(
            String.format(
                "Saldo: %.2f",
                this.saldo
            )
        );
    }
}
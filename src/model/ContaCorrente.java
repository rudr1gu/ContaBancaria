package model;

public class ContaCorrente extends Conta{
    private float limite;

    public ContaCorrente(int numeroConta, int agencia, int tipo, Pessoa pessoa, float saldo, float limite) {
        super(numeroConta, agencia, tipo, pessoa, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}

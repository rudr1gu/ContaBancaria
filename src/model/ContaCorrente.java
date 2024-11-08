package model;

public class ContaCorrente extends Conta{
    private float limite;

    public ContaCorrente(int numeroConta, int agencia, int tipo, String nomeTitular, float saldo, float limite) {
        super(numeroConta, agencia, tipo, nomeTitular, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Limite: " + this.limite);
        
    }

}

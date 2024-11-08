package model;

public class ContaPoupanca extends Conta{
    private int diaAniversario;

    public ContaPoupanca(int numeroConta, int agencia, int tipo, String nomeTitular, float saldo, int diaAniversario) {
        super(numeroConta, agencia, tipo, nomeTitular, saldo);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Dia do aniversário: " + this.diaAniversario);
        
    }
}
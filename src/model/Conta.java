package model;

import controller.ContaController;

public abstract class Conta extends ContaController {
    private int numeroConta;
    private int agencia;
    private int tipo;
    private String nomeTitular;
    private float saldo;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
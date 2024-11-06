package model;

import controller.ContaController;

public abstract class Conta extends ContaController {
    private int numeroConta;
    private int agencia;
    private int tipo;
    private Pessoa pessoa;
    private float saldo;

    public Conta(int numeroConta, int agencia, int tipo, Pessoa pessoa, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipo = tipo;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

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
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void visualizar() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nome do titular: " + this.pessoa.getNome());
        System.out.println("Saldo: " + this.saldo);
    }
}
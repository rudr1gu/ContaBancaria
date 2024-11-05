package controller;

public class ContaController {
    public void procurarNumero(int numero) {
        System.out.println("Procurando conta com número " + numero);
    }
    public void listarTodas() {
        System.out.println("Listando todas as contas");
    }
    public void cadastrar() {
        System.out.println("Cadastrando conta");
    }
    public void atualizar() {
        System.out.println("Atualizando conta");
    }
    public void deletar(int numero) {
        System.out.println("Deletando conta com número " + numero);
    }
    public void sacar(int numero, float valor) {
        System.out.println("Sacando " + valor + " da conta com número " + numero);
    }
    public void depositar(int numero, float valor) {
        System.out.println("Depositando " + valor + " na conta com número " + numero);
    }
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
        System.out.println("Transferindo " + valor + " da conta com número " + numeroOrigem + " para a conta com número " + numeroDestino);
    }
    

}

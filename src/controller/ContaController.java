package controller;
import model.Conta;

public class ContaController implements ContaRepository {

    @Override
    public void procurarNumero(int numero) {
        
    }

    @Override
    public void listarTodas() {
        throw new UnsupportedOperationException("Unimplemented method 'listarTodas'");
    }

    @Override
    public void cadastrar(Conta conta) {
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
        
    }

    @Override
    public void atualizar(Conta conta) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(int numero) {
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    @Override
    public void sacar(int numero, float valor) {
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar(int numero, float valor) {
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    public int gerarNumeroConta() {
        return 0;
    }

    public Conta buscarConta(int numero) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarConta'");
    }

  
} 
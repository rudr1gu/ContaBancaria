package repository;
import java.util.ArrayList;

import model.Conta;

public class ContaController implements ContaRepository {

    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    int numero = 0;

    @Override
    public void procurarPorNumero(int numero) {
        Conta conta = buscarCollection(numero);
        if (conta != null) {
            conta.visualizar();
        } else {
            System.out.println("Conta numero: " + numero + " não encontrada!");
        }
    }

    @Override
    public void listarTodas() {
        for (Conta conta : listaContas) {
            conta.visualizar();
        }
    }

    @Override
    public void cadastrar(Conta conta) {
       listaContas.add(conta);
       System.out.println("Conta número: "+ conta.getNumeroConta() +" cadastrada com sucesso!");
    }

    @Override
    public void atualizar(Conta conta) {
       var buscaConta = buscarCollection(conta.getNumeroConta());

       if(buscaConta != null) {
           listaContas.set(listaContas.indexOf(buscaConta), conta);
           System.out.println("\nConta número: "+ conta.getNumeroConta() +" atualizada com sucesso!");
       } else {
           System.out.println("\nConta número: "+ conta.getNumeroConta() +" não encontrada!");
       }
    }

    @Override
    public void deletar(int numero) {
        var conta = buscarCollection(numero);
        if (conta != null) {
            if(listaContas.remove(conta) == true) {
                System.out.println("Conta número: "+ numero +" deletada com sucesso!");
            }    
        } else {
            System.out.println("Conta número: "+ numero +" não encontrada!");
        }
    }

    @Override
    public void sacar(int numero, float valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar(int numero, float valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    public int gerarNumeroConta() {
        return ++ numero;
    }

    public Conta buscarCollection(int numero) {
        for (Conta conta : listaContas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
            }
        }
        return null;
    }

  
} 
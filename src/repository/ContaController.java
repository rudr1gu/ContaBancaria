package repository;


import java.util.ArrayList;
import java.util.Optional;

import model.Conta;

public class ContaController implements ContaRepository {

    private ArrayList<Conta> listaContas = new ArrayList<Conta>();
    int numero = 0;

    @Override
    public void procurarPorNumero(int numero) {
        Conta conta = buscarCollection(numero);

        Optional<Conta> contaOptional = Optional.ofNullable(conta);
        contaOptional.ifPresentOrElse(Conta::visualizar, () -> System.out.println("Conta número: " + numero + " não encontrada!"));
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

         Optional<Conta> contaOptional = Optional.ofNullable(buscaConta);
            contaOptional.ifPresentOrElse(c -> {
                listaContas.set(listaContas.indexOf(c), conta);
                System.out.println("\nConta número: "+ conta.getNumeroConta() +" atualizada com sucesso!");
            }, () -> System.out.println("\nConta número: "+ conta.getNumeroConta() +" não encontrada!"));
    }

    @Override
    public void deletar(int numero) {
        var conta = buscarCollection(numero);

        Optional<Conta> contaOptional = Optional.ofNullable(conta);
        contaOptional.ifPresentOrElse(c -> {
            listaContas.remove(c);
            System.out.println("Conta número: "+ numero +" deletada com sucesso!");
        }, () -> System.out.println("Conta número: "+ numero +" não encontrada!"));
    }

    @Override
    public void sacar(int numero, float valor) {
        var conta = buscarCollection(numero);

        Optional<Conta> contaOptional = Optional.ofNullable(conta);
        contaOptional.ifPresentOrElse(c -> {
            if(c.sacar(valor) == true) {
                System.out.println("Saque de R$ "+ valor +" realizado com sucesso!");
            }
        }, () -> System.out.println("Conta número: "+ numero +" não encontrada!"));
    }

    @Override
    public void depositar(int numero, float valor) {
        var conta = buscarCollection(numero);

        Optional<Conta> contaOptional = Optional.ofNullable(conta);
        contaOptional.ifPresentOrElse(c -> {
            c.depositar(valor);
            System.out.println("Depósito de R$ "+ valor +" realizado com sucesso!");
        }, () -> System.out.println("Conta número: "+ numero +" não encontrada!"));
    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
        var contaOrigem = buscarCollection(numeroOrigem);
        var contaDestino = buscarCollection(numeroDestino);

        Optional<Conta> contaOrigemOptional = Optional.ofNullable(contaOrigem);
        Optional<Conta> contaDestinoOptional = Optional.ofNullable(contaDestino);

        contaOrigemOptional.ifPresentOrElse(c -> {
            contaDestinoOptional.ifPresentOrElse(d -> {
                if(c.sacar(valor) == true) {
                    d.depositar(valor);
                    System.out.println("Transferência de R$ "+ valor +" realizada com sucesso!");
                }
            }, () -> System.out.println("Conta número: "+ numeroDestino +" não encontrada!"));
        }, () -> System.out.println("Conta número: "+ numeroOrigem +" não encontrada!"));
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
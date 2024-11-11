package util;

import java.util.Scanner;

import model.ContaCorrente;
import model.ContaPoupanca;
import repository.ContaController;

public abstract class ContaServices {
    static Scanner scanner = new Scanner(System.in);
    static ContaController contas = new ContaController();
    
        static int agencia, tipo, aniversario, numeroDestino;
        static float saldo, limite, valor;
    
        public static void cadastrarConta() {
            System.out.println("Cadastrar conta \n");
            System.out.println("Digite o número da agência: ");
            agencia = scanner.nextInt();
            System.out.println("Digite o nome do titular: ");
            scanner.nextLine();
            String titular = scanner.nextLine();
    
            do {
                System.out.println("Digite o tipo da conta: \n1 - Conta Corrente\n2 - Conta Poupança");
                tipo = scanner.nextInt();
            } while (tipo != 1 && tipo != 2);
    
            System.out.println("Digite o saldo inicial (R$): ");
            saldo = scanner.nextFloat();
    
            switch (tipo) {
                case 1 -> {
                    System.out.println("Digite o limite da conta corrente (R$): ");
                    limite = scanner.nextFloat();
                    contas.cadastrar(new ContaCorrente(contas.gerarNumeroConta(), agencia, tipo, titular, saldo, limite));
                }
                case 2 -> {
                    System.out.println("Digite o dia de aniversário da conta poupança: ");
                    aniversario = scanner.nextInt();
                    contas.cadastrar(new ContaPoupanca(contas.gerarNumeroConta(), agencia, tipo, titular, saldo, aniversario));
                }
            }
        }

        public static void listarTodas() {
            contas.listarTodas();
        }

        public static void buscarPorNumero() {
            System.out.println("Buscar conta por número \n");
            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            contas.procurarPorNumero(numero);
        }

        public static void atualizarConta() {
            System.out.println("Atualizar dados da conta \n");

            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            
            var buscaConta = contas.buscarCollection(numero);

            if(buscaConta != null) {

                System.out.println("Digite o número da agência: ");
                agencia = scanner.nextInt();

                System.out.println("Digite o nome do titular: ");
                scanner.nextLine();
                String titular = scanner.nextLine();
        
                System.out.println("Digite o saldo (R$): ");
                saldo = scanner.nextFloat();

                switch (buscaConta.getTipo()) {
                    case 1 -> {
                        System.out.println("Digite o limite da conta corrente (R$): ");
                        limite = scanner.nextFloat();
                        contas.atualizar(new ContaCorrente(numero, agencia, buscaConta.getTipo(), titular, saldo, limite));
                    }
                    case 2 -> {
                        System.out.println("Digite o dia de aniversário da conta poupança: ");
                        aniversario = scanner.nextInt();
                        contas.atualizar(new ContaPoupanca(numero, agencia, buscaConta.getTipo(), titular, saldo, aniversario));
                    }
                    default -> System.out.println("Tipo de conta inválido");
                }
            } else {
                System.out.println("\nConta número: "+ numero +" não encontrada!");
            }
        }

        public static void deletarConta() {
            System.out.println("Apagar conta \n");
            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            contas.deletar(numero);
        }

        public static void sacar() {
            System.out.println("Sacar \n");

            System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();
            do{
                System.out.println("Digite o valor do saque (R$): ");
                valor = scanner.nextFloat();
            } while (valor <= 0);
           
            contas.sacar(numero, valor);
        }
}

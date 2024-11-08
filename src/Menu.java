import java.util.Scanner;

import model.ContaCorrente;
import model.ContaPoupanca;
// import view.MenuView;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // MenuView menuView = new MenuView();
        // int opcao;
        // boolean isRunning = true;
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, 1, 1, "Teste", 1000, 1);
        ContaCorrente contaCorrente = new ContaCorrente(1, 2, 1, "Teste", 1000, 1);

        contaPoupanca.visualizar();
        contaCorrente.visualizar();

        contaPoupanca.depositar(100);
        contaCorrente.depositar(100);

        contaPoupanca.visualizar();

        contaCorrente.visualizar();

        contaPoupanca.sacar(100);
        contaCorrente.sacar(100);

        contaPoupanca.visualizar();
        contaCorrente.visualizar();

        // while (isRunning) {
        //     menuView.menuPrincipal();

        //     opcao = scanner.nextInt();

        //     switch (opcao) {
        //         case 1:
        //             System.out.println("Cadastrar conta");
        //             break;
        //         case 2:
        //             System.out.println("Atualizar conta");
        //             break;
        //         case 3:
        //             System.out.println("Deletar conta");
        //             break;
        //         case 4:
        //             System.out.println("Sacar");
        //             break;
        //         case 5:
        //             System.out.println("Depositar");
        //             break;
        //         case 6:
        //             System.out.println("Transferir");
        //             break;
        //         case 7:
        //             System.out.println("Listar todas as contas");
        //             break;
        //         case 8:
        //             System.out.println("Procurar conta por número");
        //             break;
        //         case 9:
        //             menuView.sobre();
        //             System.out.println("Saindo...");
        //             isRunning = false;
        //             break;
        //         default:
        //             System.out.println("Opção inválida");
        //             break;
        //     }
        // }
        scanner.close();
    }
}
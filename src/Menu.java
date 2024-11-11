import java.util.InputMismatchException;
import java.util.Scanner;

import util.MenuView;
import util.ContaServices;
import util.KeyPress;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        boolean isRunning = true;

        while (isRunning) {
            MenuView.menuPrincipal();

            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1:
                    ContaServices.cadastrarConta();
                    KeyPress.keyPress();                   
                    break;
                case 2:
                    System.out.println("Listar todas as contas");
                    ContaServices.listarTodas();
                    KeyPress.keyPress();
                    break;
                case 3:
                    ContaServices.buscarPorNumero();
                    KeyPress.keyPress();
                    break;
                case 4:
                    ContaServices.atualizarConta();
                    KeyPress.keyPress();
                    break;
                case 5:
                    ContaServices.deletarConta();
                    KeyPress.keyPress();
                    break;
                case 6:
                    System.out.println("Sacar");
                    KeyPress.keyPress();
                    break;
                case 7:
                    System.out.println("Depositar");
                    KeyPress.keyPress();
                    break;
                case 8:
                    System.out.println("Transferir valores entre contas");
                    KeyPress.keyPress();
                    break;
                case 9:
                    MenuView.sobre();
                    System.out.println("Saindo...");
                    KeyPress.keyPress();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
}
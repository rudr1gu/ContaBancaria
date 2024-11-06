import java.util.Scanner;

import view.MenuView;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuView menuView = new MenuView();

        int opcao;
        boolean isRunning = true;

        while (isRunning) {
            menuView.menuPrincipal();

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a sua idade: ");
                    int idade = scanner.nextInt();
                    if(idade < 18){
                        System.out.println("Você não pode criar uma conta, pois é menor de idade");
                        break;
                    }

                    System.out.println("Cadastrar conta");
                    break;
                case 2:
                    System.out.println("Atualizar conta");
                    break;
                case 3:
                    System.out.println("Deletar conta");
                    break;
                case 4:
                    System.out.println("Sacar");
                    break;
                case 5:
                    System.out.println("Depositar");
                    break;
                case 6:
                    System.out.println("Transferir");
                    break;
                case 7:
                    System.out.println("Listar todas as contas");
                    break;
                case 8:
                    System.out.println("Procurar conta por número");
                    break;
                case 9:
                    menuView.sobre();
                    System.out.println("Saindo...");
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

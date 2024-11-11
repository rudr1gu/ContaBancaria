package util;

public abstract class MenuView {
    

    public static void menuPrincipal() {
        System.out.println("");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println( Cores.TEXT_CYAN_BOLD_BRIGHT + "                Santo André Bank                     "+ Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println(Cores.TEXT_GREEN_BRIGHT +"            1 - Criar Conta                          ");
        System.out.println("            2 - Listar todas as Contas               ");
        System.out.println("            3 - Buscar Conta por Numero              ");
        System.out.println("            4 - Atualizar Dados da Conta             ");
        System.out.println("            5 - Apagar Conta                         ");
        System.out.println("            6 - Sacar                                ");
        System.out.println("            7 - Depositar                            ");
        System.out.println("            8 - Transferir valores entre Contas      "+ Cores.TEXT_RESET);
        System.out.println(Cores.TEXT_RED_BRIGHT + "            9 - Sair                                 "+ Cores.TEXT_RESET);
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Entre com a opção desejada:                          ");
        System.out.println("                                                     ");
    }

    public static void sobre(){
   
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            Desenvolvido por:                        ");
        System.out.println(Cores.TEXT_GREEN_BRIGHT + "            - Rodrigo Santos( Rudr1gu )              " + Cores.TEXT_RESET);
        System.out.println("            - github.com/Rudr1gu                     ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        
    }

}

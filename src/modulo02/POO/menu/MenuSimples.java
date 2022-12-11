package modulo02.POO.menu;

public class MenuSimples {
    public static void main(String[] args){
        OpcoesMenuSimples[] opcaoMenu = OpcoesMenuSimples.values();
        System.out.println("----------- ADA FLIX -----------");
        for(OpcoesMenuSimples opcao : opcaoMenu){
            System.out.println(opcao);
        };
    }
}

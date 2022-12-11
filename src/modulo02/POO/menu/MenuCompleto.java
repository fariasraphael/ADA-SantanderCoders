package modulo02.POO.menu;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MenuCompleto {
    private static final Scanner scanner = new Scanner(System.in);

    private static void exibirMenu() {
        OpcoesMenuCompleto[] opcoesMenu = OpcoesMenuCompleto.values();
        System.out.println("----------- ADA FLIX -----------");

        for (OpcoesMenuCompleto opcao : opcoesMenu) {
            System.out.println(opcao.getOpcao() + " - " + opcao.getDescricao() + " -> " + opcao);
        }
        System.out.println("Digite o ENUM correspondente a opção desejada ou digite 0 para o input numérico");

        String input = scanner.nextLine();

        if(input.equals("0")){
            escolherOpcaoPelonumero();
        } else {
            escolherOpcaoMenuPorConstante(input);
        }
    }
    private static void escolherOpcaoPelonumero(){
        System.out.print("Digite o número da opçãpo desejada: ");
        int entradaUsuario = scanner.nextInt();

        switch (entradaUsuario) {
            case 1 -> System.out.println(" -> Filme Cadastrado");
            case 2 -> System.out.println(" -> Filme Listado");
            default -> System.out.println("SAIR");
        }
    }

    private static void escolherOpcaoMenuPorConstante(String input){
        OpcoesMenuCompleto opcoesMenuCompleto = OpcoesMenuCompleto.valueOf(input);

        switch (opcoesMenuCompleto) {
            case CADASTRAR_FILME -> System.out.println(" -> Filme Cadastrado");
            case LISTAR_FILME -> System.out.println(" -> Filme Listado");
            default -> System.out.println("SAIR");
        }
    }
    public static void main(String[] args){
        exibirMenu();
    }
}
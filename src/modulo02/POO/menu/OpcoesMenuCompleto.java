package modulo02.POO.menu;

public enum OpcoesMenuCompleto {
    CADASTRAR_FILME (1, "Cadastrar Filme"),
    LISTAR_FILME (2, "Listar Filme"),
    SAIR (3, "Sair");

    private final int opcao;
    private final String descricao;

    OpcoesMenuCompleto(int opcao, String descricao) {
        this.opcao = opcao;
        this.descricao = descricao;
    }

    public int getOpcao() {
        return opcao;
    }

    public String getDescricao() {
        return descricao;
    }
}

package modulo03.projeto.livraria.venda;

import modulo03.projeto.livraria.estoque.Estoque;
import modulo03.projeto.livraria.estoque.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeVenda {

    private Double dinheiroNocaixa = 0.0;

    public Double getDinheiroNocaixa() {
        return dinheiroNocaixa;
    }

    public <P extends Produto> void venderProdutos(CarrinhoDeCompras carrinho, Estoque estoque) {

        for (int i = 0; i < carrinho.getCarrinho().size(); i++) {
            if (estoque.verificadorDeItemEmEstoque(carrinho.getCarrinho().get(i))) {
                this.dinheiroNocaixa += carrinho.getCarrinho().get(i).getPreco();
                estoque.reduzirQuantidadeDoItemNoEstoque(carrinho.getCarrinho().get(i));
            }
        }
        carrinho.getCarrinho().clear();
    }
}

package src.Factorys;
import src.Livro;
import src.Produto;

public class LivroFactory extends ProdutoFactory{

    @Override
    Produto criarProduto(String nome, double preco) {
        return new Livro(nome, preco);
    }
}

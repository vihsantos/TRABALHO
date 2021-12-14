package src.Factorys;
import src.Disciplina;
import src.Produto;

public class DisciplinaFactory extends ProdutoFactory {

    @Override
    Produto criarProduto(String nome, double preco) {
        return new Disciplina(nome, preco);
    }

}

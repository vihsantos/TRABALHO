package src.Factorys;
import src.Produto;
import src.TipoProduto;

public abstract class ProdutoFactory {

    public static Produto getFactory(TipoProduto tipo, String nome, double preco){
        ProdutoFactory factory;
        if(tipo.name().equals("Livro")){
            factory = (ProdutoFactory) new LivroFactory();
            return factory.criarProduto(nome, preco);
        }
        else if(tipo.name().equals("Disciplina")){
            factory = (ProdutoFactory) new DisciplinaFactory();
            return factory.criarProduto(nome, preco);
        }
        
        return null;
    }

    abstract Produto criarProduto(String nome, double preco);

}

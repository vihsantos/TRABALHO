package src;

public class LivroDigital extends Livro{

    public LivroDigital(Livro livro) {
        super(livro);
    }

    @Override
    public double preco() {
       return preco -= preco *0.15;
    }
    
}


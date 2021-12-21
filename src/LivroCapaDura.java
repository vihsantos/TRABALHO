package src;

public class LivroCapaDura extends Livro{

    public LivroCapaDura(Livro livro) {
        super(livro);
    }

    @Override
    public double preco() {
        return preco += preco *0.20;
    }
    
}
package src;

public class LivroFisicoColorido extends Livro {

    public LivroFisicoColorido(Livro livro) {
        super(livro);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double preco() {
        return preco += preco *0.05;
    }
    
}


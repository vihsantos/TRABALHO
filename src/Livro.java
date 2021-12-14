package src;

public class Livro extends Produto{
    String isbn;
    double preco;

    public Livro(Livro livro) {
		super(livro);
		this.isbn = livro.isbn;
		this.preco = livro.preco;
	}	
	
	public Livro(String nome, double preco) {
		super(nome, preco);
	}
	
	public Livro(String codigo, String nome, 
					  String isbn, double preco) {
		super(nome, preco);
        this.isbn= isbn;  
		this.preco = preco;
	}

    @Override
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}

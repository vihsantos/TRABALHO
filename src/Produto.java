package src;

public abstract class Produto {
    public String nome;
    public String codigo;
    double preco;
	
	public Produto(Produto produto) {
		this.codigo = produto.codigo;
		this.nome = produto.nome;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
        this.preco = preco;
	}

    public abstract double getPreco();
}

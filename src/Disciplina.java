package src;

public class Disciplina extends Produto{
    double preco;
    double pctCumprido;
    int chTotal;

    public Disciplina(Disciplina disciplina) {
		super(disciplina);
		this.chTotal = disciplina.chTotal;
		this.pctCumprido = disciplina.pctCumprido;
		this.preco = disciplina.preco;
	}	
	
	public Disciplina(String nome, double preco) {
		super(nome, preco);
	}
	
	public Disciplina(String codigo, String nome, 
					  int chTotal,
					  double pctCumprido, double preco) {
		super(nome, preco);
		this.chTotal = chTotal;
		this.pctCumprido = pctCumprido;
		this.preco = preco;
	}

    @Override
    public double getPreco() {
        return preco;
    }

    public double getPctCumprido() {
        return pctCumprido;
    }

    public void setPctCumprido(double pctCumprido) {
        this.pctCumprido = pctCumprido;
    }

    public int getChTotal() {
        return chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}

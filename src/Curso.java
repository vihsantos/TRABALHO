package src;
import java.util.List;

public class Curso extends Produto {
    
    double preco;
    List<Livro> livros;
    List<Disciplina> disciplinas;
    protected State state;

    public Curso(Curso curso) {
        super(curso);
        this.preco = curso.preco;
        this.livros = curso.livros;
        this.disciplinas = curso.disciplinas;
    }

    public Curso(Produto produto, double preco, List<Livro> livros, List<Disciplina> disciplinas) {
        super(produto);
        this.preco = preco;
        this.livros = livros;
        this.disciplinas = disciplinas;
    }

    public Curso(String nome, String codigo, double preco, List<Livro> livros, List<Disciplina> disciplinas, State state) {
        super(nome, preco);
        this.codigo= codigo;
        this.livros = livros;
        this.disciplinas = disciplinas;
        this.state= state;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void addDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public void addLivros(List<Livro> livros){
        this.livros= livros;
    }

    public int chTotal(){
        int cargaHorariaTotal = 0;

        for (Disciplina disciplina : disciplinas) {
            cargaHorariaTotal += disciplina.getChTotal();
        }

        return cargaHorariaTotal;
    }

    public double pctCumprido(){
        double pctTotalCumprido = 0;

        for (Disciplina disciplina : this.disciplinas) {
            pctTotalCumprido= pctTotalCumprido + disciplina.pctCumprido;
        }
        return pctTotalCumprido;
    }

    public void avancar(String nome, double pct){
        this.state.avancar(this, nome, pct);
    }

    public Situacao checkpoint(){
        return this.state.checkpoint(this);
    }

    public void restore(Situacao situacao){
        this.state.restore(situacao);
    }

    public void suspender(){
        this.state = this.state.suspender();
    };
    public void darAndamento(){
        this.state = this.state.darAndamento();
    };
    public void concluir(){
        this.state = this.state.concluir();
    };
    public void cancelar(){
        this.state = this.state.cancelar();
    };


}

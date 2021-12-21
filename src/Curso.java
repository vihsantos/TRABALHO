package src;
import java.util.List;

public class Curso extends Produto {
    List<Curso> cursos;
    double preco;
    List<Livro> livros;
    List<Disciplina> disciplinas;

    public Curso(Curso curso) {
        super(curso);
        this.preco = curso.getPreco();
        this.livros = curso.livros;
        this.disciplinas = curso.disciplinas;
        this.cursos= curso.cursos;
    }

    public Curso(Produto produto, double preco, List<Livro> livros, List<Disciplina> disciplinas, List<Curso> cursos) {
        super(produto);
        this.preco = preco;
        this.livros = livros;
        this.disciplinas = disciplinas;
        this.cursos= cursos;
    }

    @Override
    public double getPreco() {
        double vi=0;
        double vii= getPrecoTotalLivros() - getPrecoTotalLivros() * 0.10;

        for (Curso curso : cursos) {
            vi += curso.preco;
        }
        vi += getPrecoDisciplinas();
        vi-= vi* 0.20;

        return preco = vi+ vii;
    }

    public double getPrecoTotalLivros(){
        double valor =0;
        for (Livro livro : livros) {
            valor += livro.preco;
        }
        return valor;
    }

    public double getPrecoDisciplinas(){
        double valor =0;

        for (Disciplina disciplina : this.disciplinas) {
            valor += disciplina.preco;   
        }

        return valor;
    }

    public void addDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public void addLivros(List<Livro> livros){
        this.livros= livros;
    }

    public void addCurso(List<Curso> cursos){
        this.cursos = cursos;
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
}

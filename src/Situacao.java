package src;

public class Situacao {
    Curso curso;

    public Situacao(Curso curso) {
        this.curso = curso;
    }

}






































    // public Situacao checkpoint(){
    //     Situacao situacao = new Situacao(new Curso(this.curso.codigo, this.curso.nome, this.curso.preco, this.curso.livros, this.curso.disciplinas));
    //     System.out.printf("\n### Checkpoint concluido!###\n\nPercentual concluido: %s\n\n", situacao.curso.pctCumprido());
    //     return situacao;
    // }

    // public void restore(Situacao situacao){

    //     this.curso.codigo= situacao.curso.codigo;
    //     this.curso.nome= situacao.curso.nome;
    //     this.curso.preco= situacao.curso.preco;
    //     this.curso.disciplinas= situacao.curso.disciplinas;
    //     this.curso.livros= situacao.curso.livros;
    //     this.state= situacao.state;

    //     System.out.printf("### Restore concluido! ###\nPercentual concluido: %s", this.curso.pctCumprido());

    // }
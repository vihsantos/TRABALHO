package src;

public class EmAndamentoState implements State{

    @Override
    public void avancar(Curso curso, String nome, double pct) {   
        double percentual =0;
        for (Disciplina disciplina : curso.disciplinas) {
            if(disciplina.nome.equals(nome)){
                percentual= disciplina.pctCumprido;
                percentual= percentual + pct;
                disciplina.setPctCumprido(percentual);
            }
        }
    }

    @Override
    public void restore(Situacao situacao) {   
        Curso este = new Curso(situacao.curso.nome, situacao.curso.codigo, situacao.curso.preco, situacao.curso.livros, situacao.curso.disciplinas, situacao.curso.state);

        System.out.printf("### Restore concluido! ###\nPercentual concluido: %s", este.pctCumprido());     
    }

    @Override
    public Situacao checkpoint(Curso curso) {
        Situacao situacao = new Situacao(new Curso(curso.codigo, curso.nome, curso.preco, curso.livros, curso.disciplinas, curso.state));
        System.out.printf("\n### Checkpoint concluido!###\n\nPercentual concluido: %s\n\n", situacao.curso.pctCumprido());
        return situacao; 
    }

    @Override
    public void certificado() {
        System.out.println("## NÃO FOI POSSIVEL CONCLUIR ESTA OPERAÇÃO##");        
    }

    @Override
    public State suspender() {
        return new SuspensoState();
    }

    @Override
    public State darAndamento() {
        return new EmAndamentoState();
    }

    @Override
    public State concluir() {
        return new ConcluidoState();
    }

    @Override
    public State cancelar() {
        return new EmAndamentoState();
    }

}
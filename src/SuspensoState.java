package src;

public class SuspensoState implements State{

    @Override
    public void avancar(Curso curso, String nome, double pct) { 
        System.out.println("## NÃO FOI POSSIVEL CONCLUIR ESTA OPERAÇÃO##");        
    }

    @Override
    public void restore(Situacao situacao) {
        System.out.println("## NÃO FOI POSSIVEL CONCLUIR ESTA OPERAÇÃO##");        
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
        return new SuspensoState();
    }

    @Override
    public State cancelar() {
        return new CanceladoState();
    }
    
}

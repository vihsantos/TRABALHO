package src;

public class ConcluidoState implements State {

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
        System.out.println("## NÃO FOI POSSIVEL CONCLUIR ESTA OPERAÇÃO##"); 
        return null;
    }

    @Override
    public void certificado() {
        System.out.println("### CERTIFICADO ### \n Curso concluido com sucesso!");        
    }

    @Override
    public State suspender() {
        return new ConcluidoState();
    }

    @Override
    public State darAndamento() {
        return new ConcluidoState();
    }

    @Override
    public State concluir() {
        return new ConcluidoState();
    }

    @Override
    public State cancelar() {
        return new ConcluidoState();
    }
    
}

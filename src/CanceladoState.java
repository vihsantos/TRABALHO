package src;

public class CanceladoState implements State{

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
        System.out.println("## NÃO FOI POSSIVEL CONCLUIR ESTA OPERAÇÃO##");  
    }

    @Override
    public State suspender() {
        return new CanceladoState();
    }

    @Override
    public State darAndamento() {
        return new CanceladoState();
    }

    @Override
    public State concluir() {
        return new CanceladoState();
    }

    @Override
    public State cancelar() {
        return new CanceladoState();
    }
    
}

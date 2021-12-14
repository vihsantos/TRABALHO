package src;

public interface State {
    
    public void avancar(Curso curso, String nome, double pct);
    public void restore(Situacao situacao);
    public Situacao checkpoint(Curso curso);
    public void certificado();
    public State suspender();
    public State darAndamento();
    public State concluir();
    public State cancelar();
}

package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Cliente {
    public static void main(String[] args) throws NullPointerException{
        Stack<Situacao> checks = new Stack<Situacao>();

        Disciplina disc01 = new Disciplina("01", "DISCIPLINA01", 30, 0, 180.0);
        Disciplina disc02 = new Disciplina("02", "DISCIPLINA02", 60, 0, 220.0);
        
        List<Disciplina> disciplinas  = new ArrayList<Disciplina>();
        disciplinas.add(disc01);
        disciplinas.add(disc02);

        List<Livro> livros = null;

        Curso curso = new Curso("Curso Um", "01", 460, livros, disciplinas, new EmAndamentoState());
        
        System.out.println("####################\n");

        curso.suspender();

        System.out.println(curso.state);

        curso.cancelar();

        System.out.println(curso.state);

        checks.push(curso.checkpoint());
        curso.avancar("DISCIPLINA01", 0.50);
        checks.push(curso.checkpoint());
        curso.avancar("DISCIPLINA01", 2.50);
        checks.push(curso.checkpoint());;

    }
}

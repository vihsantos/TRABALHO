package src;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) throws NullPointerException{
        // Webinar exemplo = new Webinar("0012", "Qualquer", "qualquer.com", 180, 60);

        // WebinarAdapter disc = new WebinarAdapter(exemplo);

        // List<Disciplina> disciplinas = new ArrayList<Disciplina>();

        // disciplinas.add(disc.adptar());

        // System.out.println(disciplinas.get(0).nome);

        Livro ex = new Livro("codigo", "nome", "isbn", 15);

        Livro ex1 = new LivroCapaDura(ex);

        System.out.println(ex1.preco());

    }
}

package src;

public class WebinarAdapter implements Adaptar{

    Webinar webinar;

    public WebinarAdapter(Webinar webinar) {
        this.webinar = webinar;
    }

    @Override
    public Disciplina adptar() {
        // TODO Auto-generated method stub
        return new Disciplina(this.webinar.getTitle(), this.webinar.getPrice());
    }
    
}

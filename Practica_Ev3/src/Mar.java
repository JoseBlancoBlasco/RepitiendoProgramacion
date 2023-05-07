
public class Mar extends Agua {

    private Recurso recurso;

    public Mar(int posX, int posY, Recurso recurso) {
        super(posX, posY);
        this.recurso = recurso;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
}

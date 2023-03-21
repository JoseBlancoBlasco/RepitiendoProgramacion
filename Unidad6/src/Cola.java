
public class Cola extends Lista{    
    
    public void llegarCola(Integer elemento) {
        super.insertarFinal(elemento);
    }
    
    public Integer salirCola(){
        return super.eliminar(0);
    }
}

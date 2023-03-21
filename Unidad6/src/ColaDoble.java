
public class ColaDoble extends Cola {    

    void encolarPrincipio(Integer nuevo) {
        super.insertar(0, nuevo);
    }

    public Integer desencolarFinal() {
        return super.eliminar(tabla.length - 1);
    }

}

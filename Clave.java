public class Clave extends Cuenta {
    private String codigo = "";

    public Clave(float t, String s) {
        super(t);
        this.codigo = s;

    }

    public Clave(String s2) {
        this.codigo = s2;
    }

    public String getclavw() {
        return codigo;
    }

    public void retirar(float r) {

        if (obtener() > r) {
            super.retirar(r);
        }
    }
}
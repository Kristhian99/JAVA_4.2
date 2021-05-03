public class Cuenta {
    private float saldo;

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
        this.saldo = 0;
    }

    public void ingresar(float s) {
        saldo += s;
    }

    public void retirar(float r) {
        saldo -= r;
    }

    public float obtener() {
        return saldo;

    }

}

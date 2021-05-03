import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner menu = new Scanner(System.in);

        int m = 0;

        Clave c = null;
        while (m != 6) {
            System.out.println("Introduzca la opcion requerida");
            System.out.println("1: Crear Cuenta Vacia");
            System.out.println("2: Crear cuenta con Saldo Incial");
            System.out.println("3: Ingresar Dinero");
            System.out.println("4: Retirar Dinero");
            System.out.println("5: Mostrar Saldo");
            System.out.println("6: Salir");
            m = menu.nextInt();
            System.out.println(m);
            switch (m) {
            case 1:
                System.out.println("Ingresa clave de cuenta");
                String cv = menu.next();
                c = new Clave(cv);
                break;
            case 2:
                System.out.println("Ingresa clave de cuenta");
                String cv1 = menu.next();
                System.out.println("Ingresar dinero Inicial");
                float t = menu.nextFloat();
                c = new Clave(t, cv1);
                break;
            case 3:
                System.out.println("Ingresar Dinero a depositar");
                float d = menu.nextFloat();
                c.ingresar(d);
                break;
            case 4:
                System.out.println("Ingresar dinero a retirar");
                float g = menu.nextFloat();
                c.retirar(g);
                break;
            case 5:
                System.out.println("El saldo es:  " + c.obtener());
                break;
            case 6:
                break;
            default:
                System.out.println("Ingrese opcion valida");

            }

        }
        menu.close();
        System.out.println("Programa Finalizado");
    }
}

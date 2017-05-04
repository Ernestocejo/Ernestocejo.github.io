import java.io.*;
public class PruebaTest {

    public static void main(String[] args) {
        int opcion;
        Lector lee = new Lector();
        Almacen medicamentos = new Almacen();
        do {
            Menu menu = new Menu();
            opcion = lee.leeInt();
            switch (opcion) {
                case 1:
                    medicamentos.setListaMedic();
                    break;
                case 2:
                	medicamentos.imprListaMedic();
                    break;
                case 3:
                	System.out.println("FIN");
                	break;
            }
        } while (opcion != 3);
    }
}
import java.io.*;
import java.util.*;
public class Almacen {
	
    private ArrayList <Medicamento> listaMedicamentos = new ArrayList();

	public Almacen () {}

	public void setListaMedic() {
		Lector lee = new Lector();
		Impresion imprime = new Impresion();
          
		for(int i = 0; i<1; i++) {
			Medicamento medic_1 = new Medicamento();
			imprime.impNombreMedic();
			medic_1.setNombre(lee.leeString());
			//imprime.impPresentacion();
			//medic_1.setPresentacion(lee.leeString());
			imprime.impIDMedic();
			medic_1.setId(lee.leeInt());

				//precio
			imprime.impPrecioVenta();
			medic_1.getPrecio().setPrecioVenta(lee.leeFloat());
			imprime.impPrecioCompra();
			medic_1.getPrecio().setPrecioCompra(lee.leeFloat());
            
            
             listaMedicamentos.add(medic_1);
			
		}
	}

	public void imprListaMedic() {
    	//for (Medicamento medic : listaMedicamentos) {
		for (int i =0;i < listaMedicamentos.size() ;i++) {
    		System.out.println("--------");
    		System.out.println(listaMedicamentos.get(i));
    		//System.out.println(medic);	
    		System.out.println("--------");
    	}
    }
} 
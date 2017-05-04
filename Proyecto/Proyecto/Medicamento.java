public class Medicamento {

	private String nombre;
	//private String presentacion;
	private int id;
	private Precio precio;
	
	public Medicamento() { 
        precio = new Precio();
    }
	public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	public String getNombre() {
        return nombre;
    }
    /*
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    public String getPresentacion() {
        return presentacion;
    }
    */
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public Precio getPrecio() {
        return precio;
    }
     public String toString() {
        return ("El medicamento es: "+ this.nombre) +
        //("\nPresentacion: " + this.presentacion) +
        ("\nEl ID_numerico del medicamento es: "+ this.id) +
        ("\nEl precio del medicamento "+ this.precio);
    }
}
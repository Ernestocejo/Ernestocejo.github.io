public class Menu {

	private int opcion;

	public Menu () {
		System.out.println("Selecciona una opcion");
		System.out.println("1.- Itroducir Medicamento");
		System.out.println("2.- Mostrar Inventario");
		System.out.println("3.- Salir");
	}

	public void setMenu(int opcion) {
		this.opcion = opcion;
	}
	public int getMenu() {
		return this.opcion;
	}

}
package programacion2;

public class Profesores extends Persona {
	
	int id;
	int Ntrabajador;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNtrabajador() {
		return Ntrabajador;
	}
	public void setNtrabajador(int ntrabajador) {
		Ntrabajador = ntrabajador;
	}
	@Override
	public String toString() {
		return "\nProfesores[id=" + id + ", Nombre="+ super.getNombre() +" "+ super.getApellidos()+", genero="+super.getGenero() +",Ntrabajador=" + Ntrabajador + "]";
	}

}

package programacion2;

public class Alumnos extends Persona{
	
	int id;
	int Nodecuenta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNodecuenta() {
		return Nodecuenta;
	}
	public void setNodecuenta(int nodecuenta) {
		Nodecuenta = nodecuenta;
	}
	@Override 
	public String toString() {
		return "\nAlumno [id=" + id+ ", Nombre="+ super.getNombre() + ", Apellidos=" + super.getApellidos() + " ,genero="+super.getGenero() + ", "
				+ ", Nodecuenta= " + Nodecuenta ;
	} 
	
}



public class Alumno {

	private int NumMatricula;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Alumno(int numMatricula, String nombre, String apellido, int edad) {
		super();
		NumMatricula = numMatricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public int getNumMatricula() {
		return NumMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		NumMatricula = numMatricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

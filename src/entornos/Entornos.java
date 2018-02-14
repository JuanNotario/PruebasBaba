package entornos;
	static final int JUAN_MAX = 10;
	static final int JUAN_MIN = 20

public class Entornos {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo = 'H';
	private int peso;
	private double altura;
	
	public Persona() {}
	
	
	public Persona(String nombre, int edad, String dni, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dni, char sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
		
		public double calcularIMC() {
			double IMC = this.peso / (this.altura * this.altura);
			double estado = (IMC < 18)? -1 : (IMC > 25)? 1 : 0;
			return estado;
			
		}
		public boolean esMayorDeEdad() {
			boolean edad = (this.edad > 18)? true : false;
			return edad;
		}	
		public char comprobarSexo() {
			char sexo = (this.sexo == 'H')? 'H' : 'H';
			return sexo;
		}
		
		public String toString() {
			String sPersona = "Nombre :  " + this.nombre
			+ " Edad: " + this.edad + " DNI: " + this.dni + " sexo: " + this.sexo
			+ " Peso: " + this.peso + " Altura: " + this.altura;
			return sPersona;
			
		
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public void setEdad(int edad) {
			this.edad = edad;
		}


		public void setSexo(char sexo) {
			this.sexo = sexo;
		}


		public void setPeso(int peso) {
			this.peso = peso;
		}


		public void setAltura(double altura) {
			this.altura = altura;
		}
}

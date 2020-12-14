import java.util.Random;

public class Perro {
	
	private String nombre;
	private int numChip;
	private int edad;
	
	
	public Perro() {
		nombre = "";
		edad = 0;
		numChip = 0;
		
	}


	public Perro(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
		numChip = 0;
		
	}


	public Perro(String nombre, int numChip, int edad) {
		super();
		this.nombre = nombre;
		this.numChip = numChip;
		this.edad = edad;
	}
	
	
	public boolean comprobarChip() {
		
		if(numChip%2 == 0) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	
	public void ponerChip() {
		
		if (numChip != 0) {
			
			System.out.println("Este Perro ya Tiene su Chip");
			
		}else {
			Random r = new Random();
			this.numChip = r.nextInt(100)+1;
			
			System.out.println("Este es el Nuevo Chip de su Perro: " + this.numChip);
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Se Llama " + nombre + ", el Chip es: " + numChip + " y Tiene: " + edad + " Años.";
	}
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public int getNumChip() {
		return numChip;
	}


	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}

	

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}

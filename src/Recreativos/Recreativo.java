package Recreativos;

import java.util.Scanner;

public class Recreativo {

	public static int pintaMenu() {
		
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		
		System.out.println("Introduce");
		opc = leer.nextInt();
		
		//Guardar un nuevo juego
		//Poner puntuación a un juego
		//Ver todos los juegos
		return opc;
	}
	
	public static void verTodosJuegos(Juego vJuegos[]) {
		
	}
	
	public static void guardarJuego(Juego vJuegos[]) {
		
	}
	
	public static void ponerPuntuacionJuego(Juego vJuegos[]) {
		
	}
	
	
	public static void main(String[] args) {
		
		
		Juego vJuegos[] = new Juego[100];
		
		Juego juego1 = new Juego("CiberPunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("Fifa");
		
		vJuegos[0] = juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		vJuegos[3] = new Juego("Tetris");
		
		vJuegos[2].setMultijugador(true);
		vJuegos[2].ponerRecord(100);
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] != null && vJuegos[i].isMultijugador()) {
				System.out.println(vJuegos[i].toString());
			}
			
		}
		

	}

}
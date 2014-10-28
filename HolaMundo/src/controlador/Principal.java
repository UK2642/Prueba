package controlador;

import modelo.Saludar;

public class Principal {
	
	public Principal() {}
	public static void main(String[] args) {
		Saludar saludo=new Saludar();
		saludo.diHola("Fernando");
	}
}

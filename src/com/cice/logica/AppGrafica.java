/**
 * 
 */
package com.cice.logica;

import java.util.Scanner;

import com.cice.clases.Stock;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class AppGrafica extends Stock {
	
	
	public void showMenu(){
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
	do {
		System.out.println("		----------- Biblioteca de CICE 0.1 ----------		");
		System.out.println(" Este es el men� de usuario");	
		System.out.println(" 1.- Todos los productos.");
		System.out.println(" 2.- Numero de libros prestados.");
		System.out.println(" 3.- Publicaciones a una fecha especifica.");
		System.out.println(" 4.- Imprimir listado de publicaciones y discos.");
		System.out.println(" 5.- Imprimir listado de publicaciones prestados.");
		System.out.println(" 6.- Imprimir listado de publicaciones no prestadas.");
		System.out.println(" 0.- Salir.");
		System.out.println(" Elija una opci�n");
		System.out.print(">>>");
		opcion = sc.nextInt();
		controles(opcion);
		}while(opcion != 0);
		
	}
	
	private void controles(int opcion) {
		DesarrolloFunciones desarrollo = new DesarrolloFunciones();
	switch(opcion) {
		case 1 : desarrollo.TodosLosProductos();
			break;
		case 2 : 
			break;
		case 3 : 
			break;
		case 4 : 
			break;
		case 5 : 
			break;
		case 0 : System.out.println("Gracias por usar Biblioteca Cice 0.1"); 
			break;
			
			}
		
	}

}
package luissemana5;

import java.util.Scanner;

public class semana5 {

	public static void main(String[] args) {//esto es un cambio
	Scanner s= new Scanner (System.in);
	String pais;
	String capital;
	System.out.print("ingrese el pais:");
	pais = s.next();
	System.out.print("capital:");
	capital = s.next();
	System.out.print("usted ha ingresado:");
	System.out.print(pais+capital);   //concatenar es sumar
	}

}

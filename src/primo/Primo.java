package primo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Buenos días Ceinmark, soy Marina Torre");
		
		System.out.println("Introduce un número para averiguar si es primo o no:");
		numero = Integer.parseInt(ent.nextLine());
		
		boolean primo = true; 
        String divisores = ""; 
        int contadorDivisores = 0; 

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++; 
                    divisores += i; 
                    if (i < numero) { 
                        divisores += ", ";
                    }
                }
            }

            if (contadorDivisores == 2) {
                primo = true;
            } else {
                primo = false;
            }
        }

        //Resultado 
        if (primo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        //Divisores
        System.out.println("Los divisores del " + numero + " son: " + divisores);
        
	}//fin main

}//fin clase
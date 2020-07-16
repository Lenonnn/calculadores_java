package exibePares;

import java.io.IOException;
import java.util.Scanner;

public class numerosPares {
		  public static void main(String[] args) throws IOException {

		    Scanner ler = new Scanner(System.in);
		    int n;

		    System.out.printf("Informe um número:\n");
		    n = ler.nextInt(); 
		    System.out.println("\nVocê digitou o número : "+n);
		    System.out.printf("\nResultado:");
		    if (n % 2 == 0 ) {
		    		 System.out.println("\nO Número digitado é par!");
		    } else {
		    	System.out.println("\nNúmero digitado é impar");
		    }
		    	
		    ler.close();
		  }
	}




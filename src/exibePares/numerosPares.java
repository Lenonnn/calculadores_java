package exibePares;

import java.io.IOException;
import java.util.Scanner;

public class numerosPares {
		  public static void main(String[] args) throws IOException {

		    Scanner ler = new Scanner(System.in);
		    int n;

		    System.out.printf("Informe um n�mero:\n");
		    n = ler.nextInt(); 
		    System.out.println("\nVoc� digitou o n�mero : "+n);
		    System.out.printf("\nResultado:");
		    if (n % 2 == 0 ) {
		    		 System.out.println("\nO N�mero digitado � par!");
		    } else {
		    	System.out.println("\nN�mero digitado � impar");
		    }
		    	
		    ler.close();
		  }
	}




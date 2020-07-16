package CalculaTabuada;

import java.util.Scanner;

public class Tabuada {

 
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int i, n;
 
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
    ler.close();
    
    if (( n < 1) || (n > 10)){
		System.out.println("Para calcular a tabuada e necessário digitar valores entre 1 e 10!");
	}else {
    System.out.printf("\n+--Resultado--+\n");
    
    for (i=1; i<=10; i++) {
    	System.out.println(i+" * "+n+" = " +(i*n));
    }
    
    System.out.printf(" FIM  \n");
  }   
 }
}
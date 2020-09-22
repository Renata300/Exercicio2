package com.renatam;

import java.util.Scanner;
 
public class FizzBuzz {
 
	public static void main(String[] args) {
 
        Scanner a = new Scanner(System.in);
        
		System.out.println("Digite um numero: ");
		int numero = a.nextInt();
        
        if ((numero % 3 == 0) && (numero % 3 == 0)) { //caso o numero seja divisivel por 3 e por 5
            System.out.print("FizzBuzz");
        }
        else if (numero % 3 == 0) { //caso o numero seja divisivel por 3
            System.out.println("Fizz");
        }
        else if (numero % 5 == 0) { //caso o numero seja divisivel por 5
            System.out.print("Buzz");
        }
        else{
            System.out.print(numero);
        }
	}
}
package fac;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
	public static void main (String[]args) { 
	
	ArrayList<Integer> lista = new ArrayList<>();
	
	int texto;
	Scanner ler = new Scanner(System.in);

	lista.add(44);
	
	texto = ler.nextInt();
	lista.add(texto);
	for (int i= 0; i<lista.size(); i++) {
		System.out.println(lista.get(i));
	}
	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author clima
 */
public class No {
	int elemento;
	No esquerda, direita;
	
	No(int e){
		elemento = e;
		esquerda = null;
		direita = null;
	}
}
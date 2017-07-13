package controller;

import model.Cliente;

public class ClienteComEncapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setPrimeiroNome("André");
		cliente.setUltimoNome("Silva");
		
		System.out.println("O nome do cliente é: " + cliente.getNome());

	}

}

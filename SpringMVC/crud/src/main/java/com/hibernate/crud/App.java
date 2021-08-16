package com.hibernate.crud;

public class App {
	public static void main(String[] args) {
	
		Crud crud = new Crud();
//		crud.create(111,"Ankit","Jharkhand");
//		crud.update("Kolkata","Ankit" );
		crud.delete("Jharkhand");   // delete by city 
		crud.read();
		crud.sessionClose();
	}
}

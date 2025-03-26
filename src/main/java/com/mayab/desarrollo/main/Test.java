package com.mayab.desarrollo.main;

import org.hibernate.Session;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;
import com.mayab.desarrollo.servicios.LoginServicio;

public class Test {

	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		LoginServicio servicio = new LoginServicio(dao);
		boolean isOk = servicio.createUser("username", "pass", "email");
		if(isOk) {
			System.out.println("Usuario creado correctamente");
		}
		else {
			System.out.println("Error al crear usuario");
		}
	}
}

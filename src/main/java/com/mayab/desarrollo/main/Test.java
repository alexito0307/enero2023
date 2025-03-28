package com.mayab.desarrollo.main;

import java.util.List;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;
import com.mayab.desarrollo.servicios.LoginServicio;

public class Test {

	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		LoginServicio servicio = new LoginServicio(dao);
		Usuario usuario1 = servicio.createUser("username", "pass", "email");
		Usuario usuario2 = servicio.createUser("username2", "pass2", "email2");
		List<Usuario> listaUsuarios = servicio.findAll();
		for(Usuario usuario : listaUsuarios) {
			System.out.println(usuario.toString());
		}
		servicio.updatePass(usuario2, "otrapass");
		listaUsuarios = servicio.findAll();
		for(Usuario usuario : listaUsuarios) {
			System.out.println(usuario.toString());
		}
	
	}
}

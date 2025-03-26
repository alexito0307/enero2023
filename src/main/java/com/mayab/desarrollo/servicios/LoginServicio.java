package com.mayab.desarrollo.servicios;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;

public class LoginServicio {
  private UserDAO dao;
  public LoginServicio(UserDAO dao) {
    this.dao = dao;
  }
  public boolean createUser(String username, String pass, String email) {
    Usuario usuario = new Usuario();
    usuario.setPassword(pass);
    usuario.setNombre(username);
    usuario.setEmail(email);
    int id = dao.createUser(usuario);
    System.out.println("EL ID ES: " + id);
    return true;
  }
}

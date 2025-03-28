package com.mayab.desarrollo.servicios;

import java.util.List;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;

public class LoginServicio {
  private UserDAO dao;
  public LoginServicio(UserDAO dao) {
    this.dao = dao;
  }
  public Usuario createUser(String username, String pass, String email) {
    Usuario usuario = new Usuario();
    usuario.setPassword(pass);
    usuario.setNombre(username);
    usuario.setEmail(email);
    int id = dao.createUser(usuario);
    System.out.println("EL ID ES: " + id);
    return usuario;
  }
  public Usuario findByEmail(String email) {
    return dao.findByEmail(email);
  }
  public Usuario findUsuarioById(int id) {
    return dao.findById(id);
  }
  public void deleteUser(int id) {
    dao.deleteUser(id);
  }
  public void updatePass(Usuario usuario, String contra) {
    dao.updatePass(usuario, contra);
  }
  public Usuario findByName(String nombre) {
    return dao.findByName(nombre);
  }
  public List<Usuario> findAll() {
    return dao.findAll();
  }
}

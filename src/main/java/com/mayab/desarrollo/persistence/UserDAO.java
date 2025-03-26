package com.mayab.desarrollo.persistence;

import java.util.List;

import org.hibernate.Session;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.main.HibernateUtil;

public class UserDAO implements IUserDAO{
  public int createUser(Usuario usuario) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    int id = (int) session.save(usuario);
    session.getTransaction().commit();
    session.close();
    return id;
  }

  @Override
  public List<Usuario> findAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findAll'");
  }

  @Override
  public boolean deleteUser(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
  }

  @Override
  public Usuario findById(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findById'");
  }

  @Override
  public Usuario updatePass(Usuario usuario, String contra) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updatePass'");
  }

  @Override
  public Usuario findByName(String nombre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByName'");
  }

  @Override
  public Usuario findByEmail(String email) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
  }
}

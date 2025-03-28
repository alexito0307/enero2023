package com.mayab.desarrollo.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

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
  public Usuario findByEmail(String email) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Query query = session.createQuery("from Usuario where email = :email");
    query.setParameter("email", email);
    Usuario usuario = (Usuario) query.uniqueResult();
    session.close();
    return usuario;
  }

  @Override
  public Usuario findById(int id) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Usuario usuario = session.get(Usuario.class, id);
    session.close();
    return usuario;
  }

  @Override
  public List<Usuario> findAll() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Query query = session.createQuery("FROM Usuario");
    List<Usuario> usuarios = query.getResultList();
    session.close();
    return usuarios;
  }

  @Override
  public boolean deleteUser(int id) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Usuario usuario = session.get(Usuario.class, id);
    session.delete(usuario);
    session.getTransaction().commit();
    return true;
  }

  @Override
  public Usuario updatePass(Usuario usuario, String contra) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    usuario.setPassword(contra);
    session.update(usuario);
    session.getTransaction().commit();
    session.close();
    return usuario;
  }

  @Override
  public Usuario findByName(String nombre) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Query query = session.createQuery("from Usuario where nombre = :nombre");
    query.setParameter("nombre", nombre);
    Usuario usuario = (Usuario) query.uniqueResult();
    session.close();
    return usuario;
  }

}

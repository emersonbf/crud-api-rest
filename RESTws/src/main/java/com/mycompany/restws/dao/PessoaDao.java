
package com.mycompany.restws.dao;

import com.mycompany.restws.modelo.Pessoa;
import com.mycompany.restws.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 *  @author Emerson Borges Ferreira
 *  Eng. Computação
 */
public class PessoaDao {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public Pessoa getPessoaById(int id){
        Pessoa pessoa = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            pessoa = (Pessoa ) session.createQuery("from Pessoa p where p.id = :id").setParameter("id", id).uniqueResult();
            session.getTransaction().commit();
            
        }catch(Exception e){
            if(session != null ){
                session.getTransaction().rollback();
            }
        }finally {
            if(session != null ){
                session.close();
            }
        }
        
        return pessoa;
    }
    
    public List<Pessoa> getPessoas( ){
        List<Pessoa> pessoas = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            pessoas = session.createQuery("from Pessoa p").list();
            session.getTransaction().commit();
            
        }catch(Exception e){
            if(session != null ){
                session.getTransaction().rollback();
            }
        }finally {
            if(session != null ){
                session.close();
            }
        }
        
        return pessoas;
    }
    
    
    //Método para inserir nova pessoa ou atualizar
    public boolean salvarPessoa (Pessoa pessoa){
        Session session = null;
        boolean status_erro = false;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(pessoa);
            session.getTransaction().commit();
            
        }catch(Exception e){
            if(session != null){
                session.getTransaction().rollback();
            }
            status_erro = true;
            
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return status_erro;
    }
    
    public boolean deletePessoa(int id){
        
        Session session = null;
        boolean status_erro = false;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.createQuery("delete Pessoa where id = :id").setParameter("id", id).executeUpdate();
            session.getTransaction().commit();
            
        }catch(Exception e){
            if(session != null ){
                session.getTransaction().rollback();
            }
            status_erro = true;
        }finally {
            if(session != null ){
                session.close();
            }
        }
        
        return status_erro;
    }
    
    
}

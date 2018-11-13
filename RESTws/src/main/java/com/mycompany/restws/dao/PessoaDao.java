/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restws.dao;

import com.mycompany.restws.modelo.Pessoa;
import com.mycompany.restws.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author User
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
    
}

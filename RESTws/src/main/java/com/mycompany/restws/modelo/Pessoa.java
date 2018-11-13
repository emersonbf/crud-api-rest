
package com.mycompany.restws.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Emerson Borges Ferreira
 * Eng. Computação
 */
/*
    DB Uusuário:
        Nome, Sobrenome, Data de Nascimento, Sexo, E-mail ,Telefone ,Login , Senha 
*/
@Entity
@Table(name="pessoa")

@XmlRootElement(name = "pessoa") 
@XmlType(propOrder={"id","nome","sobreNome","dataNascimento","sexo","email","telefone","login","senha"})
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="sobrenome")
    private String sobreNome;
    
    @Column(name="data_nasc")
    private String dataNascimento;
    
    @Column(name="sexo")
    private String sexo;
    
    @Column(name="email")
    private String email;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="login")
    private String login;
    
    @Column(name="senha")
    private String senha;
    

    @XmlElement
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement
    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    @XmlElement
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @XmlElement
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlElement
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @XmlElement
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

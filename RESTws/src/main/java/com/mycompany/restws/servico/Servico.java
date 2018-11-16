
package com.mycompany.restws.servico;

import com.mycompany.restws.dao.PessoaDao;
import com.mycompany.restws.modelo.Pessoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Emerson Borges Ferreira
 * Eng. Computação
 * 
 */
@Path("servico")
public class Servico {
    
    private PessoaDao pessoaDao = new PessoaDao();
    
    // Mérodo para RETORNAR uma Pessoa em XML
    @GET
    @Path("/getPessoaByIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Pessoa getPessoaByIdXML(@PathParam("id")int id){
        return pessoaDao.getPessoaById(id);
    }
    
    // Mérodo para RETORNAR uma Pessoa em JSON
    @GET
    @Path("/getPessoaByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getPessoaByIdJSON(@PathParam("id")int id){
        return pessoaDao.getPessoaById(id);
    }
    
    // Método para RETORNAR uma lista de Pessoa em XML
    @GET
    @Path("/getPessoasInXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Pessoa> getPessoasInXML(){
        return pessoaDao.getPessoas();
    }
    
    // Método para RETORNAR uma lista de Pessoa em JSON
    @GET
    @Path("/getPessoasInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> getPessoasInJSON(){
        
        List<Pessoa> listaPessoa = null;
        
        try{
            listaPessoa = pessoaDao.getPessoas();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaPessoa;
    }
    
    // Testar receber JSON
    /*
        @POST
        @Consumes({"URL/json"})
        @Path("salvarPessoa/inserir")
    */
    
    // Método para INSERIR Pessoa, com retorno em JSON
    @GET
    @Path("/salvarPessoa/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}")
    @Produces(MediaType.APPLICATION_JSON)
    public String savarNovaPessoa(@PathParam("nome") String nome,
                                  @PathParam("sobreNome") String sobreNome,
                                  @PathParam("data_nasc") String dataNascimento,
                                  @PathParam("sexo") String sexo,
                                  @PathParam("email") String email,
                                  @PathParam("telefone") String telefone,
                                  @PathParam("login") String login,
                                  @PathParam("senha") String senha ){
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(nome);
        pessoa.setSobreNome(sobreNome);
        pessoa.setDataNascimento(dataNascimento);
        pessoa.setSexo(sexo);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);
        pessoa.setLogin(login);
        pessoa.setSenha(senha);
        
        if( !pessoaDao.salvarPessoa(pessoa) ){
            return "(\"status\":\"OK\")";
        }else {
            return "(\"status\":\"ERROR NOT OK\")";
        }
    }
    
    // Método para ATUALIZAR Pessoa, com retorno em JSON
    @GET
    @Path("/salvarPessoa/{id}/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}")
    @Produces(MediaType.APPLICATION_JSON)
    public String atualizarPessoa(@PathParam("id") int id,
                                  @PathParam("nome") String nome,
                                  @PathParam("sobreNome") String sobreNome,
                                  @PathParam("data_nasc") String dataNascimento,
                                  @PathParam("sexo") String sexo,
                                  @PathParam("email") String email,
                                  @PathParam("telefone") String telefone,
                                  @PathParam("login") String login,
                                  @PathParam("senha") String senha ){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setId(id);
        pessoa.setNome(nome);
        pessoa.setSobreNome(sobreNome);
        pessoa.setDataNascimento(dataNascimento);
        pessoa.setSexo(sexo);
        pessoa.setEmail(email);
        pessoa.setTelefone(telefone);
        pessoa.setLogin(login);
        pessoa.setSenha(senha);
 
        if( !pessoaDao.salvarPessoa(pessoa) ){
            return "(\"status\":\"OK\")";
        }else {
            return "(\"status\":\"ERROR NOT OK\")";
        }
    }
    
    // Método para DELETAR Pessoa, com retorno em JSON
    @GET
    @Path("/deletePessoa/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePessoaById(@PathParam("id") int id){
        
         if( !pessoaDao.deletePessoa(id) ){
            return "(\"status\":\"OK\")";
        }else {
            return "(\"status\":\"ERROR NOT OK\")";
        }
    }
    
}


package com.mycompany.restws.servico;

import com.mycompany.restws.dao.PessoaDao;
import com.mycompany.restws.modelo.Pessoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
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
    
 /* PARA TESTE
    
    // Simular um banco de dados ( PARA TESTE )
    private static Map<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();
    
    // Dados para teste
    static{
        for (int i=0; i<10; i++){
            Pessoa pessoa = new Pessoa();
            int id = i + 1;
            pessoa.setId(id);
            pessoa.setNome("Nome"+id);
            pessoa.setSobreNome("Sobrenome"+id);
            pessoa.setDataNascimento("01/01/2001");
            pessoa.setSexo("Masc");
            pessoa.setEmail("teste@teste.com");
            pessoa.setTelefone("9 99999999");
            pessoa.setLogin("user"+id);
            pessoa.setSenha("pass");
            
            pessoas.put(id, pessoa);
        }
    }
*/   

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
    
    // ERROR
    // Método para RETORNAR uma lista de Pessoa em JSON
    @GET
    @Path("/getPessoasInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> getPessoasInJSON(){
        return pessoaDao.getPessoas();
    }
    
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

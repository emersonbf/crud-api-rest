
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
    
    // Mérodo para retornar um objeto do tipo pessoa
    @GET
    @Path("/getPessoaByIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Pessoa getPessoaByIdXML(@PathParam("id")int id){
        return pessoaDao.getPessoaById(id);
    }
    
    @GET
    @Path("/getPessoaByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa getPessoaByIdJSON(@PathParam("id")int id){
        return pessoaDao.getPessoaById(id);
    }
    
    // Método para retornar uma lista de objetos do tipo pessoa
    @GET
    @Path("/getPessoasInXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Pessoa> getPessoasInXML(){
        return pessoaDao.getPessoas();
    }
    
    // ERROR
    @GET
    @Path("/getPessoasInJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoa> getPessoasInJSON(){
        return pessoaDao.getPessoas();
    }
    
}

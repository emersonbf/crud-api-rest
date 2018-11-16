
package Requisicao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *  @author Emerson Borges Ferreira
 *  Eng. Computação
 */

/**
 *  URL: http://localhost:8084/RESTws/servico/
 *   
 *  getPessoaByIdXML/{id}
 *
 * RETORNAR PESSOA: getPessoaByIdJSON/{id}
 * RETORNAR LISTA:  getPessoasInJSON   
 * INSERIR:      salvarPessoa/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}
 * EDITAR:       salvarPessoa/{id}/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}
 * DELETAR:      deletePessoa/{id}
 * 
 */

public class HttpRequisicao {
    
    private final String USER_AGENT = "Mozilla/5.0";
    private final String URL_WS = "http://localhost:8084/RESTws/servico/";
    
        
    public String sendGet( String urlMetodo) throws Exception {

        String url = URL_WS + urlMetodo;
        
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Define método GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()) );
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
        }
        in.close();
        
        return (response.toString());
    }
}

package code;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Emerson Borges Ferreira
 *  Eng. Computação
 */
public class Validacao {
 
    
    public boolean ValidaEmail (String email) {
        boolean status = false;
        //Java email validation permitted by RFC 5322
        //String emailPattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        String emailRegex = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$";
        
        Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        
        if ( matcher.matches() ){
           status = true;
        }
        
        return status;
    }
    
        public boolean ValidaData (String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
        
    public boolean ValidaDataFutura(String data) {
         boolean status = false;
            
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        LocalDate hoje = LocalDate.now();
            
        if ( (dataVerificada.compareTo(hoje) <= 0 ) ){
            status = true;
        }
        
        return status;
    }
        
        
    public  boolean ValidaNome (String nome) {
        boolean status = false;
        
        String nomeRegex  = "^((\\b[A-zÀ-ú']{2,40}\\b)\\s*){1,}$";
        
        Pattern pattern = Pattern.compile(nomeRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(nome);
        
        if ( matcher.matches() ){
           status = true;
        }
        
        return status;
    }
    
    public  boolean ValidaSobrenome (String nome) {
        boolean status = false;
        
        String nomeRegex  = "^((\\b[A-zÀ-ú']{1,40}\\b)\\s*){1,}$";
        
        Pattern pattern = Pattern.compile(nomeRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(nome);
        
        if ( matcher.matches() ){
           status = true;
        }
        
        return status;
    }
    
    // validar força da senha ( ERRO Para algumas senhas ) ++++++++++++++
    public  int ValidaSenha (String senha) {
        int status = 0; // -1= senha INVALIDA ( não pode cadastrar )
                        // 0 = Senha Fraca    ( pode cadastrar )  
                        // 1 = Senha Média    ( pode cadastrar )
                        // 2 = Senha Forte    ( pode cadastrar )
                                //"^(?=.*\\d)(?=.*[a-zA-Z])(?!.*[\\W_\\x7B-\\xFF]).{4,15}$"
        String senhaFracaRegex  = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{4,}$";
        Pattern patternFraca = Pattern.compile(senhaFracaRegex);
        Matcher matcherFraca = patternFraca.matcher(senha);
        
        String senhaMediaRegex  = "^(?=^.{4,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$";
        Pattern patternMedio = Pattern.compile(senhaMediaRegex);
        Matcher matcherMedio = patternMedio.matcher(senha);
        
        String senhaForteRegex = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
        Pattern patternForte = Pattern.compile(senhaForteRegex);
        Matcher matcherForte = patternForte.matcher(senha);
        
        if( matcherFraca.matches() ){
            // Senha Fraca
            // Deve Conter: maiúsculas, minúsculas e Number e minimo de 4 caracteres no total
            status = 0;
        } else if( matcherMedio.matches() ) {
           // Senha Media
           // Deve Conter: maiúsculas, minúsculas e Number e minimo de 4 caracteres no total
            status = 1; 
        }else if( matcherForte.matches() ) {
            // senha Media
            // Deve Conter: Letras minúsculas, maiúsculas, números, caractere especial e minimo de 8 caracteres no total
            status = 2; 
         }else {
            // Senha fraca
            // Não pode se cadastrar com uma senha tão fraca
            status = -1;
        }

        return status;
    } 

}

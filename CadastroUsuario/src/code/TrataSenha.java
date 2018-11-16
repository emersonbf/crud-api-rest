
package code;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


/**
 *
 * @author Emerson Borges Ferreira
 *  Eng. Computação
 * 
 */
public class TrataSenha {
    
    
    public String criptogravaSenhaSHA(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
 
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senhaHex = hexString.toString();
        return senhaHex;
    }
    
        public String criptogravaSenhaBase64(String senha) {
        
            String senhaCod = Base64.getEncoder().encodeToString(senha.getBytes());
            
        return senhaCod;
    }
    
    public String descriptogravaSenhaBase64(String senha){
        
        byte[] bytsCodigicados = Base64.getDecoder().decode(senha);
        String senhaDecod = new String(bytsCodigicados);
        
        return senhaDecod;
    }
 
}

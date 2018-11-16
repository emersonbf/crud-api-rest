
package cadastrousuario;

import Modelo.Pessoa;
import Requisicao.HttpRequisicao;
import code.Validacao;
import com.google.gson.Gson;
import javax.swing.JOptionPane;

/**
 * 
 *  @author Emerson Borges Ferreira
 *  Eng. Computação
 * 
 */
public class TelaEditarUsuario extends javax.swing.JFrame {

    TelaListarUsuarios objListarUsuarios;
    int idPessoa;
    /**
     * Creates new form TelaEditarUsuario
     */
    public TelaEditarUsuario() {
        initComponents();
        
        ComboBoxSexoEditar.addItem("Masculino");
        ComboBoxSexoEditar.addItem("Feminino");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeEditar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSobrenomeEditar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLoginEditar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxSexoEditar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSalvarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
        txtSenhaEditar = new javax.swing.JPasswordField();
        msgNivelSenhaEditar = new javax.swing.JLabel();
        txtDataNascimentoEditar = new javax.swing.JFormattedTextField();
        txtEmailEditar = new javax.swing.JFormattedTextField();
        txtTelefoneEditar = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Usuário Cadastrado");
        setResizable(false);
        setSize(new java.awt.Dimension(420, 350));

        jLabel1.setText("Nome");

        jLabel5.setText("Sobrenome");

        jLabel6.setText("Data de Nascimento");

        jLabel7.setText("Sexo");

        jLabel8.setText("E-mail");

        jLabel9.setText("Telefone Fixo");

        jLabel10.setText("Login");

        jLabel11.setText("Senha");

        btnSalvarEditar.setText("Salvar");
        btnSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSalvarEditar)
                .addComponent(btnCancelarEditar))
        );

        txtSenhaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaEditarActionPerformed(evt);
            }
        });
        txtSenhaEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaEditarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaEditarKeyReleased(evt);
            }
        });

        msgNivelSenhaEditar.setText("Invalida");

        try {
            txtDataNascimentoEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmailEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailEditarActionPerformed(evt);
            }
        });

        try {
            txtTelefoneEditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(txtNomeEditar)
                            .addComponent(txtDataNascimentoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxSexoEditar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSobrenomeEditar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoginEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(txtEmailEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefoneEditar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(msgNivelSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxSexoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgNivelSenhaEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jLabel3.setText("Editar Usuário");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_usuario72.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditarActionPerformed
        // TODO add your handling code here:
        HttpRequisicao req = new HttpRequisicao();
        Gson g = new Gson();
        Pessoa p = new Pessoa();
        
        if( validarInformacoes(p) ){
            try{
                String metodo = "salvarPessoa/";
                String dadosPessoaURL = metodo
                                     + idPessoa +"/"
                                     + ""+p.getNome()+"/"
                                     + ""+p.getSobreNome()+"/"
                                     + ""+p.getDataNascimento()+"/"
                                     + ""+p.getSexo()+"/"
                                     + ""+p.getEmail()+"/"
                                     + ""+p.getTelefone()+"/"
                                     + ""+p.getLogin()+"/"
                                     + ""+p.getSenha()+"";

                dadosPessoaURL = dadosPessoaURL.replace(" ", "%20");
                String resp = req.sendGet(dadosPessoaURL);  

                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso! ");
                controleTela();
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao editar usuário. ");
                controleTela();
            }
            
            
        }

    }//GEN-LAST:event_btnSalvarEditarActionPerformed

    
    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        // TODO add your handling code here:
    
        controleTela();

    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void txtSenhaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaEditarActionPerformed

    private void txtSenhaEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaEditarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaEditarKeyPressed

    private void txtSenhaEditarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaEditarKeyReleased
        // TODO add your handling code here:

        forcaSenha(txtSenhaEditar.getText());
   
    }//GEN-LAST:event_txtSenhaEditarKeyReleased

    private void txtEmailEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarUsuario().setVisible(true);
            }
        });
    }

    private void controleTela(){
        if( objListarUsuarios == null){
            dispose();
            objListarUsuarios = new TelaListarUsuarios();
            objListarUsuarios.setVisible(true);
        }else{
            dispose();
            objListarUsuarios.setVisible(true);
            objListarUsuarios.setState(TelaExcluirUsuario.NORMAL);
        }
    }
    
    public void recebeUsuarioParaEditar(Pessoa p){
       
        txtNomeEditar.setText(p.getNome());
        txtSobrenomeEditar.setText(p.getSobreNome());
        txtDataNascimentoEditar.setText(p.getDataNascimento().replace("-", "/"));
        ComboBoxSexoEditar.setSelectedItem(p.getSexo());      
        txtEmailEditar.setText(p.getEmail());
        txtTelefoneEditar.setText(p.getTelefone());
        txtLoginEditar.setText(p.getLogin());      
        
        txtSenhaEditar.setText(p.getSenha());
        forcaSenha(txtSenhaEditar.getText());
        
        idPessoa = p.getId();
        
    }
    
    private boolean validarInformacoes (Pessoa p){
        Validacao valida = new Validacao();
        boolean status = true;
        
        // Validar Nome e Sobrenome
        if( valida.ValidaNome(txtNomeEditar.getText() ) ){
            p.setNome(txtNomeEditar.getText());
            
            if( valida.ValidaSobrenome( txtSobrenomeEditar.getText() ) ){
                p.setSobreNome(txtSobrenomeEditar.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Sobrenome Invalido !" );
                status = false;
                return status;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nome Invalido !" );
            status = false;
            return status;
        }
        
        // Validar Data de Nascimento
        if( valida.ValidaData(txtDataNascimentoEditar.getText()) && valida.ValidaDataFutura(txtDataNascimentoEditar.getText()) ){
             p.setDataNascimento(txtDataNascimentoEditar.getText().replace("/", "-"));
        }else {
            JOptionPane.showMessageDialog(null, "Data de Nascimento Invalida!" );
            status = false;
            return status;
        }
     
        // Sexo não precisa de validação
        p.setSexo((String)ComboBoxSexoEditar.getSelectedItem()); 
        
        // Valida email
        if(valida.ValidaEmail(txtEmailEditar.getText()) ){
            p.setEmail(txtEmailEditar.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Email Invalido!" );
            status = false;
            return status;
        }
        
        // Telefone é campo obrigatório
        String telefone = txtTelefoneEditar.getText();
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");
        if( telefone.equals("") || (telefone.length()< 10) ){
            JOptionPane.showMessageDialog(null, "Informe um numero de telefone fixo valido!" );
            status = false;
            return status;
        }else{
           p.setTelefone(txtTelefoneEditar.getText());
        }
        
        // login é campo obrigatório
        if( (txtLoginEditar.getText().equals("")) || (txtLoginEditar.getText().length()< 4) ){
            JOptionPane.showMessageDialog(null, "Informe um login com mínimo de 4 caracteres!" );
            status = false;
            return status;
        }else{
            for( int i=0; i<txtLoginEditar.getText().length(); i++ ){
                if( txtLoginEditar.getText().charAt(i) == ' ' ){
                    JOptionPane.showMessageDialog(null, "Login não pode conter espaço." );
                    status = false;
                    return status;
                }
            }
            p.setLogin(txtLoginEditar.getText());
        }
        
        // Validação da Senha
        if( valida.ValidaSenha(txtSenhaEditar.getText()) >= 0 ){
            // Codificar SENHA, antes de inserir no banco de dados
            String senha = new String(txtSenhaEditar.getPassword());
            p.setSenha(senha);
        }else{
            JOptionPane.showMessageDialog(null, "Senha deve conter letras e números, mínimo 4 caracteres!" );
            status = false;
            return status;
        }
       
        return status;
    }
        
    private void forcaSenha(String senha){
        
        Validacao valida = new Validacao();
        int statusSenha = valida.ValidaSenha(senha);

        switch (statusSenha) {
            case -1:
                msgNivelSenhaEditar.setText("Invalida");
                break;
            case 0:
                msgNivelSenhaEditar.setText("Fraca");
                break;
            case 1:
                msgNivelSenhaEditar.setText("Média");
                break;
            case 2:
                msgNivelSenhaEditar.setText("Forte");
                break;
        }
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSexoEditar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnSalvarEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msgNivelSenhaEditar;
    private javax.swing.JFormattedTextField txtDataNascimentoEditar;
    private javax.swing.JFormattedTextField txtEmailEditar;
    private javax.swing.JTextField txtLoginEditar;
    private javax.swing.JTextField txtNomeEditar;
    private javax.swing.JPasswordField txtSenhaEditar;
    private javax.swing.JTextField txtSobrenomeEditar;
    private javax.swing.JFormattedTextField txtTelefoneEditar;
    // End of variables declaration//GEN-END:variables
}
# crud-api-rest

Back-end: RESTws
Front-end: CadastroUsuario 

============================================================ Banco de dados (MYSQL)
===================================================================================
Local: crud-api-rest
Nome do banco: restws.sql;
Tabela: Pessoa;

Configurações do banco, arquivo "hibernate.cfg.xml", no projeto RESTws.
Configurações do JDBC: 
                      com.mysql.jdbc.Driver
                      jdbc:mysql://localhost:3306/restws
                      user: root
                      password:

================================================================= Back-end (RESTws)
===================================================================================

API Rest foi desenvolvida utilizando RestEasy, Maven, JDBC (Mysql), Tomcat 
e IDE Netbeans 8.1.

Implementado na API os métodos de CRUD: 
Inserir, Recuperar, Atualizar e deletar.

Os métodos são utilizados via GET, e a nomenclatura de cada método esta 
visível na URL apenas para fins didáticos, a implementação final da API 
deve ser via POST ou com os métodos ocultos.

URL: http://localhost:8084/RESTws/servico/
Chamada dos métodos:
RETORNAR PESSOA: getPessoaByIdJSON/{id}
RETORNAR LISTA PESSOA:  getPessoasInJSON
INSERIR PESSOA: salvarPessoa/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}
EDITAR PESSOA:  salvarPessoa/{id}/{nome}/{sobreNome}/{data_nasc}/{sexo}/{email}/{telefone}/{login}/{senha}
DELETAR PESSOA: deletePessoa/{id}

O retorno gerado pela API é em formato JSON, 
e algumas mensagens de STATUS foram implementadas, como respostas, OK e ERROR NOT OK.
Visando informar o sucesso de uma operação no banco de dados.

======================================================= Front-end (CadastroUsuario)
===================================================================================

A aplicação front-end Cadastro de Usuário, é uma aplicação desktop em java
composta por quatro telas, onde a tela principal é a tela de cadastro para
novos usuários. Nesta tela é possível inserir um novo usuário e acessar
a tela de usuários cadastrados. Na tela usuários cadastrados, contém todos
os usuários do sistema, e as opções de Editar ou Excluir um usuário.

Todos os campos contêm tratamento, para validar os daos, e os campos 
data de nascimento e telefone, contém mascaras para padronizar os dados.

O campo senha recebe uma verificação em tempo real, para informar o nível
de segurança da senha. A senha deve conter um mínimo de 4 caracteres e deve
conter no mínimo uma letra ou um número.
Nivel da Senha: 
Invalida: Senha menor de 4 caracteres, somente letras, somente números
Fraca: Deve conter letras e números e ter no mínimo 4 caracteres no total
Média: Deve conter no mínimo uma letra maiúscula, letras minúsculas e um número
Forte: Deve conter no mínimo uma letra maiúscula, letras maiúsculas, números, 
caractere especial e mínimo de 8 caracteres no total

A verificação dos dados foi implementada utilizando expressões regulares e Pattern.
Estes métodos necessitam de implementação de rotina de testes. Os testes realizados 
nestes métodos foram de simples conferencia e testes de força.

Um método chamado TrataSenha foi implementado, com a finalidade de criptografar
a senha antes de armazena-la no banco de dados. O método está funcionando e utiliza 
criptografia SHA-256 ou encode em Base64. Porém este método não foi aplicado no campo senha, 
para facilitar a didática na conferência dos dados inseridos e os armazenados no banco.

===================================================================================
===================================================================================

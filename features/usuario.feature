# language: pt

@AdicionarCliente

Funcionalidade: Adicionar cliente em um crud
 
Cenario: testar o cadastro do cliente e validar se foi salvo corretamente

Dado que altero a versão do sistema
E acesso o formulário
E preencho o formulário com as informações solicitadas
Quando clicar no botão Salvar
Então valido a mensagem de sucesso do cadastro
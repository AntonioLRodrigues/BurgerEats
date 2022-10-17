#language: pt
#Author: antonioleonel@e2etreinamentos.com.br

@regressivos @cadastroPrestador
Funcionalidade: Cadastro de prestador de servicos
  Como prestador de servicos
  Quero realizar o meu cadastro
  Para realizar entregas

 Contexto: Acessar a tela de cadastro
  Dado que eu esteja na tela de cadastro 

   @positivo @smoke @moto
  Cenario: Realizar cadastro metodo moto
  E preencha dados pessoais validos 
  E preencha endereco valido
  E selecione tipo de veiculo
  Quando envie a foto da cnh valida
  Entao clicar em cadastre-se para fazer entregas 
  E valido cadastro realizado com sucesso
  
 @positivo @bicicleta
  Cenario: Realizar cadastro metodo bicicleta
  Quando eu clicar em cadastra-se para entrega de bicicleta
  Entao eu valido as informacoes
  
   @positivo @van
  Cenario: Realizar cadastro metodo van
   Quando eu clicar em cadastra-se para entrega de van
   Entao eu valido as informacoes
  
  @negativo @maisDeUmMetodo
  Cenario: Selecionar mais de um metodo de entrega 
   Mas escolher mais de um metodo de entrega
   Quando clico em cadastra-se
  Entao eu valido a mensagem de erro sobre a obrigatoridade do metodo de entrega
  
    @negativo @dadosBranco
  Cenario: Realizar cadastro com dados em Branco
     Mas nao informo nenhum dado obrigatorio
     Quando clico em cadastra-se
     Entao valido mensagens nos campos indicando obrigatoridade do preenchimento
     
       @negativo @dadosInvalidos
  Cenario: Realizar cadastro com dados invalidos
   Mas informo dado obrigatorios invalidos
     Quando clico em cadastra-se
     Entao valido mensagens nos campos indicando dados invalidos
  
    @negativo @semAnexo
  Cenario: Realizar cadastro sem enviar anexo
     E preencho os campos obrigatorios
     Mas nao anexo a cnh
     Quando clico em cadastra-se
     Entao valido mensagem de erro sobre a obrigatoriedade do anexo
  
    @negativo @BUG
  Cenario: Realizar cadastro sem metodo de entrega
     Mas nao informo nenhum metodo de entrega
     Quando clico em cadastra-se
     Entao valido mensagem de erro sobre a obrigatoriedade de um metodo
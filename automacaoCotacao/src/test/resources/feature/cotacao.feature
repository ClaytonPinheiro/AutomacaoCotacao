#language:pt
Funcionalidade: Teste seguro de veiculo
Cenário: Preencher formulário e enviar cotação
Dado que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
Quando eu preencher o formulário da página Enter Vehicle Data e avançar
E eu preencher o formulário da página Enter Insurant Data e avançar
E eu preencher o formulário da página Enter Product Data e avançar
E eu selecionar a opção de preço e avançar
E eu preencher o formulário da página Send Quote e avançar
Então a mensagem "Sending e-mail success" é exibida
  
  
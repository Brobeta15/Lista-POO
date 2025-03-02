Lista com dois exercícios de orientação a objeto em java. Estou começando a estudar POO, então pode conter alguns erros nos códigos. Por favor, sinta-se livre para adiconar melhorias e compartilhar dicas comigo.


LISTA POO

Exercicio 1

Implementar uma classe Lampada que deve possuir
como características/atributos:

• tipo (led, fluorescente,...)
• voltagem
• cor
• marca
• preço
• potência
• status(boolean)

Nesta classe devem ser implementados os métodos:
o acender
o e apagar.

• Em uma outra classe chamada LampadaTesteVetor deverá ser criado um
vetor para armazenar 15 objetos do tipo Lampada.

• O programa deverá exibir o seguinte menu para o
usuário(criar métodos para cada ação do menu)
o Cadastrar lâmpada
o Exibir todas as lâmpadas
o Exibir quantidade de lâmpadas cadastradas
o Consultar quantidade de lâmpadas de uma determinada potência
(digitada pelo usuário)
o Exibir os dados das lâmpadas com preço menor do que o preço
médio das lâmpadas cadastradas
o Exibir a quantidade de lâmpadas acesas e apagadas
o Sair

===================================================================================================================================================

Exercicio 2

Implementar uma classe Apolice com os seguintes atributos:
1. nome do assegurado
2. idade do segurado
3. cidade onde mora assegurado
4. valor do prêmio da apólice

• Nesta classe Apolice devem ser implementados os métodos:

o imprimir () - este método não retorna valor e deverá mostrar na tela
todos os atributos da classe Apolice.

o calcularPremioApolice() - este método não retorna valor e deverá
calcular o valor do prêmio seguindo as seguintes regras:
▪ caso a idade seja maior ou igual a 18 e menor ou igual a 25
anos, use a formula valorPremio+=(valorPremio*20)/100
▪ Quando a idade for superior a 25 e menor ou igual a 26, use a
formula valorPremio+=(valorPremio*15)/100
▪ Quando a idade for superior a 36 use a formula
valorPremio+=(valorPremio*10)/100

o oferecerDesconto() - este método não retorna valor, mas recebe o
parâmetro cidade, que irá conter o nome da cidade para o cálculo do
desconto:
▪ caso a cidade seja Blumenau, dê um desconto de no valor do
premio de 20%
▪ caso seja São Paulo, dê um desconto no valor do premio de
15%
▪ caso seja Porto Alegre dê um desconto no valor do premio de
10%
▪ caso seja Belo Horizonte dê um desconto no valor do premio
de 5%

Logo após implementar a classe Apolice, implemente em uma classe
chamada ApoliceTeste uma sequência de instruções para testar as
funcionalidades da classe Apolice.
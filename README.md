# Concordion demo

O propósito desse projeto é ser a base de um guia passo-a-passo de como implementar testes funcionais com Concordion.

## Funcionalidade exemplo

O exemplo é construído ao redor da estória "Exibir saudação para usuário após login".
A feature é evoluída em 3 estágios:

 * Exibir saudação
 * Exibir saudação com nome do usuário
 * Exibir saudação com concordância nominal correta

## Estrutura do projeto

Tanto a spec HTML e a fixture java encontram-se no diretório $PROJECT_HOME/src/test/specs.
 
## Configuração dos testes

O pom.xml foi configurado para executar testes unitários com o goal test e os testes funcionais 
com o goal integration-test.

## Executando os testes

    $ mvn clean integration-test
    
## Relatório de testes

O relatório de saída do concordion é escrito no arquivo 
$PROJECT_HOME/target/specs/br/com/adriandantas/concordion/demo/SaudacaoLogin.html 
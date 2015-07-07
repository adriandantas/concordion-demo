package br.com.adriandantas.concordion.demo;

/**
 * Gera mensagens de saudação para usuários.
 */
public class SaudacaoLogin {

    /**
     * Retorna mensagem de saudação.
     *
     * @return Saudação
     */
    public String getSaudacao(String nome) {
        return String.format("Bem-vindo, %s.", nome);
    }
}
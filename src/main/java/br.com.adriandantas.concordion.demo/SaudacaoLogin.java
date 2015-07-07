package br.com.adriandantas.concordion.demo;

/**
 * Gera mensagens de saudação para usuários.
 */
public class SaudacaoLogin {

    /**
     * Retorna mensagem de saudação.
     *
     * @param nome Nome do usuário.
     * @param sexo Sexo do usuário.
     * @return Saudação
     */
    public String getSaudacao(String nome, String sexo) {
        String saudacao;
        if ("F".equals(sexo))
            saudacao = "Bem-vinda, %s.";
        else
            saudacao = "Bem-vindo, %s.";
        return String.format(saudacao, nome);
    }
}
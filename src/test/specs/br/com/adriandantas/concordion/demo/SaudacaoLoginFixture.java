package br.com.adriandantas.concordion.demo;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SaudacaoLoginFixture {

    private SaudacaoLogin saudacaoLogin;

    @Before
    public void before(){
        saudacaoLogin = new SaudacaoLogin();
    }

    @After
    public void after(){
        saudacaoLogin = null;
    }

    public String getSaudacao() {
        return saudacaoLogin.getSaudacao();
    }
}

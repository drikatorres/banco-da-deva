package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ContaTest {


    static Conta conta;
    @BeforeAll
    public static void init () {
        //Teste não ficam isolados, logo pode dar problema
        //conta = new Conta ();
    }

    //@Before -> JUnit 4
    @BeforeEach
    public void setup() {
        conta = new Conta();

    }
    @Test
    @DisplayName("Teste depósito")
    public void quandoDepositarValorPostivo_entaoAumentaValorNoSaldo () {
        //GIVEN

        //WHEN
        boolean depositou = conta.depositar(BigDecimal.valueOf(200));

        //THEN
        assertEquals(BigDecimal.valueOf(200), conta.getSaldo());
        assertTrue(depositou);
    }

    @DisplayName("Teste saque")
    @Test
    public void quandoSacarValorPositivo_entaoSubatraiValorDoSaldo () {
        //GIVEN
        conta.depositar(BigDecimal.valueOf(500));

        //WHEN
        conta.sacar(BigDecimal.valueOf(10));

        //THEN
        assertEquals(BigDecimal.valueOf(490), conta.getSaldo());

    }





}

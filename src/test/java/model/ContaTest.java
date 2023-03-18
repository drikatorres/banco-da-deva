package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class ContaTest {


    Conta conta;
    static Extrato extrato;
    @BeforeAll
    public static void init () {
        //Teste não ficam isolados, logo pode dar problema
        //Mock -> cria um objeto fake
        extrato = Mockito.mock(Extrato.class);
    }

    //@Before -> JUnit 4
    @BeforeEach
    public void setup() {
        conta = new Conta(extrato);
    }
    @Test
    @DisplayName("Teste depósito de valor positivo")
    public void quandoDepositarValorPostivo_entaoAumentaValorNoSaldo () {
        //GIVEN
        BigDecimal valor = BigDecimal.valueOf(200);
        Mockito.when(extrato.registrar(TipoOperacao.deposito, valor)).thenReturn(true);

        //WHEN
        boolean depositou = conta.depositar(valor);

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

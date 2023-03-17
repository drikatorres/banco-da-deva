package model;

import java.math.BigDecimal;

public class Extrato {
    public boolean registrar (TipoOperacao tipoOperacao, BigDecimal valor) {
        System.out.println("Operação de " + tipoOperacao + " no valor de R$" + valor);
        return true;
    }
}

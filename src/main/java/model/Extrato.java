package model;

import java.math.BigDecimal;

//não tem mudança do estado do objeto
public class Extrato {
    public boolean registrar (TipoOperacao tipoOperacao, BigDecimal valor) {
        if (tipoOperacao != null && valor != null) {
            System.out.println("Operação de " + tipoOperacao + " no valor de R$" + valor);
            return true;
        } else {
            return false;
        }
    }
}

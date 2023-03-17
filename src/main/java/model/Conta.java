package model;

import java.math.BigDecimal;

public class Conta {
    private Long id;
    private String agencia;
    private String numero;
    private BigDecimal saldo;

    public void setId(Long id) {
        this.id = id;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public boolean depositar (BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return true;
    }

    public boolean sacar (BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        return true;
    }
}

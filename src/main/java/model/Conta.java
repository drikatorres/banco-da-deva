package model;

import java.math.BigDecimal;

public class Conta {
    private Long id;
    private String agencia;
    private String numero;
    private BigDecimal saldo;

    public Conta () {
        this.saldo = BigDecimal.ZERO;
    }

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
        if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar (BigDecimal valor) {
        if (valor != null && valor.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.subtract(valor);
            return true;
        } else {
            return false;
        }
    }
}

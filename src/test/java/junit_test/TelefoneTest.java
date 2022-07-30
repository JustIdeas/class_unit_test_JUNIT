package junit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TelefoneTest{
    Telefone telefone = new Telefone(null, 0);
    int saldo = 100;
    String numero = "(48) 9 9988-8899";
    String nomeCliente = "#$*&$*/;/;//!@#$%¨VIVO&*()/*/-+/////;z";

    @Test
    public void setTelefoneESaldo() {
        telefone.setNumeroLinha(numero);
        telefone.setSaldo(saldo);
        assertEquals(saldo, telefone.getSaldo());
        assertEquals(numero, telefone.getNumeroLinha());
    }  
}

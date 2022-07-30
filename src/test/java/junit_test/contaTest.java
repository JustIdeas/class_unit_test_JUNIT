package junit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class contaTest {
    
    Cliente cliente = new Cliente(null, null, null);
    Telefone telefone = new Telefone(null, 0);
    Conta conta = new Conta(0);
    
    int saldo = 100;
    int recarga = 50;
    
    @Test
    public void validarCargaERecarga() {

        // Cenário positivo, cliente possui saldo de 100 e recarrega 50, onde é validado que o saldo anterior está diferente depois da recarga
        // E o saldo atual é a soma do (saldo anterior mais a recarga) comparando com o saldo atual
        conta.setSaldo(saldo);
        conta.setRecarga(recarga);
        conta.setSaldo(conta.getSaldo() + conta.getRecarga());

        assertNotEquals(saldo, conta.getSaldo());
        assertEquals(saldo+recarga, conta.getSaldo());
    }

    @Test
    public void negativoValidarCargaERecarga_saldo_50() {
        //Teste negativo, cliente recarrega 50 e saldo se torna 50, não soma o que ja tinha (100).
        
        conta.setSaldo(saldo);
        conta.setRecarga(recarga);
        conta.setSaldo(conta.getRecarga());

        assertNotEquals(saldo+recarga, conta.getSaldo());  
    }

    @Test
    public void negativoValidarCargaERecarga_sem_recarga() {
        //Teste negativo, cliente recarrega 50 porém saldo continua com o valor anterior (100)
        
        conta.setSaldo(saldo);
        conta.setRecarga(recarga);
        conta.setSaldo(conta.getSaldo());

        assertEquals(saldo, conta.getSaldo()); 
    }

}

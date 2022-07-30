package junit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    Cliente cliente = new Cliente(null, null, null);

    String nomeCliente = "#$*&$*/;/;//!@#$%¨_VIVO_&*()/*/-+/////;z";

    @Test
    
    public void adicionarNome() {
        cliente.setNome(nomeCliente);
        assertEquals(nomeCliente, cliente.getNome());
    }
 
 
    @Test
    public void negativoErroNomeCliente() {
        //Teste negativo, cliente muda de nome, porém continua o antigo nome, gerando a falha.
        String newName = "Undead";
        cliente.setNome(nomeCliente);
        assertNotEquals(newName, cliente.getNome());
    }
}

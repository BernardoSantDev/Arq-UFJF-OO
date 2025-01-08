package bancario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void testValorDepositoInvalidoContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        try {
            conta.depositar(-100.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido.", e.getMessage());
        }
    }

    @Test
    void testDepositarContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.setTaxaManutencao(5);
        conta.setSaldo(1000.0);
        conta.depositar(500.0);
        assertEquals(1495.0, conta.getSaldo());
    }

    @Test
    void testSacarContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(1000.0);
        conta.sacar(400.0);
        assertEquals(600.0, conta.getSaldo());
    }

    @Test
    void testSaldoInsuficienteSaqueContaCorrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.setSaldo(1000.0);
        try {
            conta.sacar(1500.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente.", e.getMessage());
        }
    }


}
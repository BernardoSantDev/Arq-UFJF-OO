package bancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void testDepositarContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setNumeroConta("12345");
        conta.setSaldo(1000.0);
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void testValorDepositoInvalidoContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        try {
            conta.depositar(-100.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido.", e.getMessage());
        }
    }


    @Test
    void testSacarContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setSaldo(1000.0);
        conta.sacar(400.0);
        assertEquals(600.0, conta.getSaldo());
    }

    @Test
    void testSaldoInsuficienteSaqueContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setSaldo(1000.0);
        try {
            conta.sacar(1500.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente.", e.getMessage());
        }
    }


    @Test
    void testCalcularJurosContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setTexaJuros(0.05);
        conta.setSaldo(1000.0);
        conta.calcularJuros();
        assertEquals(1050.0, conta.getSaldo());
    }



}
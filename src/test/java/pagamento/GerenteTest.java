package pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    public void deveGerente() {
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(1000);
        gerente.setBonus(600);
        assertEquals(1600,  gerente.calcularPagamento());
    }

}
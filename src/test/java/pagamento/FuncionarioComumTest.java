package pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    public void devefunc() {
        FuncionarioComum funcionarioComum = new FuncionarioComum();
        funcionarioComum.setSalarioMensal(1000);
        assertEquals(1000, funcionarioComum.calcularPagamento());
    }
}
package Produtos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void testCalculoPrecoProdutoEletronico() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Celular");
        produtoEletronico.setPrecoBase(2000.00);
        assertEquals(1800.00, produtoEletronico.calcularPreco());
    }
}
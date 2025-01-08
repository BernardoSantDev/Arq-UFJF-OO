package gerenciamentoprodutos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void testCalcularPrecoProdutoRoupa() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setNome("Camiseta");
        produto.setPrecoUnitario(50.0);
        produto.setQuantidadeEstoque(10);
        assertEquals(90.0, produto.calcularPreco(2));
        assertEquals(8, produto.getQuantidadeEstoque());
    }

}
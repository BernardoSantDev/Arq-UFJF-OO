package gerenciamentoprodutos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void testCalcularPrecoProdutoAlimento() {
        ProdutoAlimento produto = new ProdutoAlimento();
        produto.setNome("Arroz");
        produto.setPrecoUnitario(5.0);
        produto.setQuantidadeEstoque(20);
        assertEquals(15.0, produto.calcularPreco(3));
        assertEquals(17, produto.getQuantidadeEstoque());
    }


}
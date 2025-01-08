package gerenciamentoprodutos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void testCalcularPrecoProdutoEletronico() {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setNome("Notebook");
        produto.setPrecoUnitario(2000.0);
        produto.setQuantidadeEstoque(5);
        assertEquals(2000.0, produto.calcularPreco(1));
        assertEquals(4, produto.getQuantidadeEstoque());
    }

}
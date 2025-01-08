package veiculos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testCalcularCustoCarro() {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setPrecoBase(50000);
        carro.setFatorcarro(1.5);
        assertEquals(75000.0, carro.calcularCusto());
    }

}
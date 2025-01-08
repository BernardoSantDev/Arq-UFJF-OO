package veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void testCalcularCustobIKE() {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setMarca("Caloi");
        bicicleta.setModelo("Elite");
        bicicleta.setPrecoBase(2000);
        bicicleta.setFatorbike(1.2);
        assertEquals(2400.0, bicicleta.calcularCusto());
    }

}
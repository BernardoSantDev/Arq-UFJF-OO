package veiculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void testCalcularCustoMoto() {
        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("MT-07");
        moto.setPrecoBase(30000);
        moto.setFatormoto(1.2);
        assertEquals(36000.0, moto.calcularCusto());
    }

}
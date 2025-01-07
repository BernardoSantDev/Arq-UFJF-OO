package passagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void testVooInternacional() {
            VooInternacional vooInternacional = new VooInternacional( );
        vooInternacional.setFatorPrecoInt(4);
        vooInternacional.setMoeda(3);
        vooInternacional.setDestino("Brasil");
        vooInternacional.setOrigem("Suiça");
        vooInternacional.setDistancia(7979);
        assertEquals(95748.00, vooInternacional.calcularPreco());
    }

}
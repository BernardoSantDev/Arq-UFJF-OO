package passagens;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void testVooDomestico(){
        VooDomestico vooDomestico = new VooDomestico( );
        vooDomestico.setfatorPrecoDom(4);
        vooDomestico.setDestino("Rio de Janeiro");
        vooDomestico.setOrigem("São Paulo");
        vooDomestico.setDistancia(445.5);
        assertEquals(1782.00, vooDomestico.calcularPreco());
    }
}
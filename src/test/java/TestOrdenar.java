import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ordenar.ordenaBubbleSort;
import algoritmos.bubbleSort;
import org.junit.Test;
import ordenar.ordenacao;

public class TestOrdenar{
    ordenacao ordenacao;

    @Test
    public void testeOrdenaBubbleSort() {
        ordenacao = new ordenaBubbleSort();
        assertTrue(ordenacao.getOrdenar() instanceof bubbleSort);
    }

    @Test
    public void testeOrdenaBubbleValor() {
        ordenacao = new ordenaBubbleSort();
        int num [] = {20,10,30};
        int ordem []= ordenacao.ordena(num[]);
        assertEquals(ordem[0], 10);
    }
}

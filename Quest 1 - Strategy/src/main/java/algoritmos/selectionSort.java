package algoritmos;
import ordenar.ordenar;

public class selectionSort implements ordenar{
    @Override
    public int ordena(int vet[]) {
        for (int fixo = 0; fixo < vet.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vet.length; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
        return vet[0];
    }
}

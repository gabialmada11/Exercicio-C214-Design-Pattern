package algoritmos;
import ordenar.ordenar;

public class insertionSort implements ordenar{
    @Override
    public int ordena(int vet[]) {
        int j;
        int key;
        int i;

        for (j = 1; j < vet.length; j++) {
            key = vet[j];
            for (i = j - 1; (i >= 0) && (vet[i] > key); i--) {
                vet[i + 1] = vet[i];
            }
            vet[i + 1] = key;
        }
        return vet[0];
    }
}

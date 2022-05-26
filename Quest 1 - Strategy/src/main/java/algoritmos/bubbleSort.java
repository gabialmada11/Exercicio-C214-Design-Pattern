package algoritmos;
import ordenar.ordenar;

public class bubbleSort implements ordenar{
    @Override
    public int ordena(int vet[]) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vet.length - 1; i++) {
                if (vet[i] > vet[i + 1]) {
                    aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return vet[0];
    }

}

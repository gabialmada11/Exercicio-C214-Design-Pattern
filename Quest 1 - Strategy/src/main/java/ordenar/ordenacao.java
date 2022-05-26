package ordenar;

public abstract class ordenacao {

    protected ordenar ordenar;

    public int ordena(int vet[]){
        return ordenar.ordena(vet);
    }

    public ordenar getOrdenar(){
        return ordenar;
    }

    public void setOrdenar(ordenar ordenar){
        this.ordenar = ordenar;
    }


}

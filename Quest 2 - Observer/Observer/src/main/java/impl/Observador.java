package impl;
import interfaces.iObservador;
public class Observador implements iObservador{

    private String frase;
    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel app) {
        System.out.println("Cliente: "+this.id);
        System.out.println("Frase: " + app.getFrase());
        System.out.println("Essa frase tem essas palavras: " + app.quebraPalavras());
        System.out.println("Essa frase tem " + app.qntPalavras() + " palavras.\n" );
    }
}

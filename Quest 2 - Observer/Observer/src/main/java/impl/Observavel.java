package impl;

import java.util.ArrayList;
import java.util.List;
import interfaces.iObservavel;

public class Observavel implements iObservavel{

    private String frase;
    private String quebrarFrase[];
    private List<Observador> clientes;

    public Observavel() {
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    //Esse método é chamado sempre que os valores
    //se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovoAnuncioFrase(String frase) {
        System.out.println("\n\n####### App anuncia uma nova frase ####\n\n");
        this.frase = frase;
        novasMedidas();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setClientes(List<Observador> clientes) {
        this.clientes = clientes;
    }

    public List<Observador> getClientes() {
        return clientes;
    }

    public String[] quebraPalavras() {
        String frase1 = this.frase;
        String[] palavras = frase1.split(" ");
        for(int i=0; i < palavras.length; i++){
            System.out.println(palavras[i]);
        }
        return palavras;
    }

    public String qntPalavras() {
        String frase2 = this.frase;
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        int tokensCount1  = stringTokenizer1.countTokens();
        return String.valueOf(tokensCount1);
    }
}

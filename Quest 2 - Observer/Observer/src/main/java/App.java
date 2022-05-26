import impl.Observavel;
import impl.Observador;

public class App {

    public static void main(String[] args) {

        // Criando o observavel (subject) netflix.
        Observavel app = new Observavel();

        //Criando 3 observadores e fazendo a inscrição em Netflix.
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        app.registraObservador(obs1);
        app.registraObservador(obs2);
        app.registraObservador(obs3);

        app.setNovoAnuncioFrase("Boa noite professor");
        app.setNovoAnuncioFrase("Instituto Nacional de Telecomunicações");
        app.setNovoAnuncioFrase("Hoje tem gol do Gabigol");

        app.removeObservador(obs3);

        System.out.println("\n\nMandando notificação das frases: ");
        app.notificaObservadores();

    }

}

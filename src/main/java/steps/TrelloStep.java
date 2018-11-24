package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class TrelloStep {

    @Dado("^que eu esteja logado no Trello$")
    public void queEuEstejaLogadoNoTrello() {
        System.out.println("Dado");
        
    }

    @E("^tenha acesso ao board \"([^\"]*)\"$")
    public void tenhaAcessoAoBoard(String arg0) throws Throwable {
        System.out.println("E");
        throw new PendingException();
    }

    @Quando("^clico em \"([^\"]*)\" um cartao$")
    public void clicoEmUmCartao(String arg0) throws Throwable {
        System.out.println("Quando");
    }

    @Entao("^o cartao e \"([^\"]*)\"$")
    public void oCartaoE(String arg0) throws Throwable {
        System.out.println("Então");
    }
}

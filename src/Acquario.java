import java.security.InvalidParameterException;

public class Acquario {
    public String nome;
    public Pesce[] pesci;

    public Acquario(String nome, Pesce[] pesci) throws InvalidParameterException {
        if(!this.nome.equals("")){
            this.nome = nome;
        } else {
            throw new InvalidParameterException("nome must can't be empty");
        }
        this.pesci = new Pesce[pesci.length];
        setPesci(pesci);
    }
    public Acquario(String nome, int numeroPesci) throws InvalidParameterException {
        if(!this.nome.equals("")){
            this.nome = nome;
        } else {
            throw new InvalidParameterException("nome must can't be empty");
        }
        this.pesci = new Pesce[numeroPesci];
    }
}
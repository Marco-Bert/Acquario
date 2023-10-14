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
    public String getNome(){
        return this.nome;
    }
    public Pesce[] getPesci(){
        Pesce[] cp = new Pesce[this.pesci.length];
        for(int x = 0; x < this.pesci.length; x++){
            cp[x] = (Pesce) this.pesci[x].clone();
        }
        return cp;
    }
    public void setPesci(Pesce[] pesci){
        this.pesci = new Pesce[pesci.length];
        for(int x = 0; x < pesci.length; x++){
            this.pesci[x] = (Pesce) pesci[x].clone();
        }
    }
}
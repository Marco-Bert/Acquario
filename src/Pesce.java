import java.security.InvalidParameterException;

public class Pesce {
    private int id;
    private String nome;
    private String colore;

    public Pesce(int id, String nome, String colore) throws InvalidParameterException {
        if(this.id <= 0){
            this.id = id;
        } else {
            throw new InvalidParameterException("id must be <= 0");
        }
        if(!this.nome.equals("")){
            this.nome = nome;
        } else {
            throw new InvalidParameterException("nome must can't be empty");
        }
        if(!this.colore.equals("")){
            this.colore = nome;
        } else {
            throw new InvalidParameterException("colore must can't be empty");
        }
    }
    public String getNome(){
        return this.nome;
    }
    public String getColore(){
        return this.colore;
    }
    public Object clone() throws InvalidParameterException {
        return new Pesce(this.id, this.nome, this.colore);
    }
    public String toString(){
        return "{\"id\":" + this.id + ", \"nome\": \"" + this.nome + "\", \"colore\": \"" + this.colore + "\"}";
    }
}

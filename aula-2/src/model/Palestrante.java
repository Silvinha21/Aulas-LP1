package model;

public class Palestrante {
    public String nome;
    public String email;
    public String foto;
    public String biografia;
    public String atuacao;
    
    public Palestrante(String nome, String email, String foto, String biografia, String atuacao) {
        this.nome = nome;
        this.email = email;
        this.foto = foto;
        this.biografia = biografia;
        this.atuacao = atuacao;
    }
    
    public Palestrante() {
    }
}

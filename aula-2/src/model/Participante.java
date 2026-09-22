package model;

public class Participante {
    public String nome;
    public String cpf;
    public String email;
    public String instituicao;
    public String curso;
    public String tipoParti;
    
    public Participante(String nome, String cpf, String email, String instituicao, String curso, String tipoParti) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.instituicao = instituicao;
        this.curso = curso;
        this.tipoParti = tipoParti;
    }
    
    public Participante() {
    }
}

package model;

public class Atividade {
    String titulo, descricao, responsavel, tipo;

    public Atividade() {
        
    }

    public Atividade(String titulo, String descricao, String responsavel, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }
}

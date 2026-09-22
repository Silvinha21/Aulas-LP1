package model;

public class Evento {
    public String nome;
    public String desc;
    public String data;
    public String horario;
    public String local;
    public String tema;
    public String modalidade;
    public int capacidade;

    public Evento(String nome, String desc, String data, String horario, String local, String tema, String modalidade, int capacidade) {
        this.nome = nome;
        this.desc = desc;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.tema = tema;
        this.modalidade = modalidade;
        this.capacidade = capacidade;
    }
    
    public Evento() {
    }
}

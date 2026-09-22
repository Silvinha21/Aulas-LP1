package model;

public class Atividade {
    public String horario;
    public String local;
    public String desc;
    public String responsaveis;
    
    public Atividade(String horario, String local, String desc, String responsaveis) {
        this.horario = horario;
        this.local = local;
        this.desc = desc;
        this.responsaveis = responsaveis;
    }
    
    public Atividade() {
    }
}

package model;

public class Certificado {
    public Participante participante;
    public Evento evento;
    public int ch;
    public String dataEmissao;
    public String codVali;
   
    public Certificado(Participante participante, Evento evento, int ch, String dataEmissao, String codVali) {
        this.participante = participante;
        this.evento = evento;
        this.ch = ch;
        this.dataEmissao = dataEmissao;
        this.codVali = codVali;
    }
   
    public Certificado() {
    }
}

package model;

public class Pagamento {
    public int valor;
    public String data;
    public String formaPagamento;
    public String statusTrans;
   
    public Pagamento(int valor, String data, String formaPagamento, String statusTrans) {
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.statusTrans = statusTrans;
    }
   
    public Pagamento() {
    }
}

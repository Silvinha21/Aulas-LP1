import model.Evento;

public class App {
    public static void main(String[] args) throws Exception {
        
        Evento evento = new Evento();
        evento.nome = "Techweek";
        evento.data = "12/07/2026";
        evento.local = "IFBA";
        evento.capacidade = 12;
        
        Evento evento2 = new Evento();
        evento2.nome = "SNCT";
        evento2.data = "12/10/2026";
        evento2.local = "IFBA";
        evento2.capacidade = 12;
    }
}

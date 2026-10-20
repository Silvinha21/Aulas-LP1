import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Atividade;

public class App {
    public static void main(String[] args) throws Exception {
        /*Atividade att1 = new Atividade("IoT: do Circuito ao código", "Curso introdutorio IOT", "Fabiano, Arthur, Eduardo","minicurso");
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(att1);*/


        Scanner s = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        int i =0;
        while(i<5){
            System.out.print("nome: "); String n = s.next();
            System.out.print("turma: ");String t = s.next();
            System.out.print("nota: "); int nt = s.nextInt();
            Aluno a = new Aluno(n,t,nt);
            alunos.add(a);
            i++;
        }

        for(Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.nome);
        }
    }
}

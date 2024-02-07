import java.util.ArrayList;

public class Curso {
    String nome;
    String descricao;
    ArrayList<String> professores;
    int cargaHoraria;

    public void progresso(){
        System.out.println("*PROGRESSO NO CURSO");
    }

    public void notas() {
        System.out.println("*NOTAS*");
    }

    public void participacao() {
        System.out.println("*PARTICIPAÇÃO NO CURSO*");
    }
}

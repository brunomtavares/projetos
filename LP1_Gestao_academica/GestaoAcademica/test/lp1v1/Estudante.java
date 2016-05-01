package lp1v1;


import java.util.ArrayList;

/**
 *
 * @author 41583469
 */
public class Estudante {
    private long id;//Numero
    private String nome;
    private String email;
    private ArrayList<Matricula> matriculas; 
    
    
    public Estudante(long id,String nome,String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.matriculas = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    public void addMatricula(Matricula matricula){
        //System.out.println("Adicinou nova matricula " + matricula.getEstudante().getNome());
        matriculas.add(matricula);
    }
    public ArrayList<Disciplina> getDisciplinasMatriculadas(){
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for(Matricula matricula:matriculas){
            disciplinas.add(matricula.getDisciplina());
        }
        return  disciplinas;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1v1;

import java.util.ArrayList;

/**
 *
 * @author 41583469
 */
public class Estudante {
    private long id;
    private String nome;
    private String email;
    private ArrayList<Matricula> matriculas; 
    
    public Estudante(long id,String nome,String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
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
        
    }
    //Ver como isso funciona
    public ArrayList<Disciplina> getDisciplinasMatriculadas(){
        
        return getDisciplinasMatriculadas();
    }
}

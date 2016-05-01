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
public class Disciplina {
    private String codigo;
    private int creditos;
    private ArrayList<Matricula> matriculas;
    
    public Disciplina(String codigo,int creditos){
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    public void addMatricula(Matricula matricula){
        
    } 
    public ArrayList<Estudante> getEstudantesMatriculados(){
        //acertar
        return getEstudantesMatriculados();
    }
}

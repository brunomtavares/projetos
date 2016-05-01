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
public class Universidade {
    private String nome;
    private ArrayList<Estudante> estudantes;
    private ArrayList<Disciplina> disciplinas;
    
    public Universidade(String nome){
        this.nome = nome;
    }
    public void carregarDados(String arquivoDisciplinas,String arquivosEstudantes,String arquivoMatriculas){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}

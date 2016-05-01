/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versao1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class GestaoAcademicaApp1 {
    
    public static Universidade mackenzie;

    public static void main(String[] args) {
        mackenzie = new Universidade("Mackenzie");
        mackenzie.carregarDadosArquivo("disciplinas-abddcdccebbdcebdbadd.txt", "estudantes-abddcdccebbdcebdbadd.txt", "matriculas-abddcdccebbdcebdbadd.txt");
        //Usuario irá informar sua escolha para o menu
        selection(choose());
    }

    //Menu com as opções 
    public static void selection(int choose) {
        switch (choose) {
            case 1:
                break;
            case 2:
                getDisciplinas();
                break;
            case 3:
                getInformacoesDisciplina();
                break;
            case 4:
                break;
            default:
                break;
        }

    }

    //Dados seleciodos pelo menu;
    public static int choose() {
        int resp = 0;
        try {
            resp = Integer.parseInt(JOptionPane.showInputDialog("Informe sua escolha:\n"
                    + "1 - Listar número e nome de todos estudande \n"
                    + "2 - Listar o código de todas as diciplicas \n"
                    + "3 - Listar todas as informações dos estudande matricula-dos em uma determina diciplica \n"
                    + "4 - Listar todas as informações de uma diciplica em que um determinado estudante está matriculado"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Valores não informados corretamente");
        }

        return resp;
    }
    
    public static void getDisciplinas(){
        String listaDisciplina = "";
        for(Disciplina objDisciplina : mackenzie.getDisciplinas())
        {
            listaDisciplina += objDisciplina.getCodigo() +  "\n";
        }
        JOptionPane.showMessageDialog(null,listaDisciplina);
    }
    
    public static void getInformacoesDisciplina(){
        String codigoDisciplina = "";
        String listaDisciplina = "";
        String listaAlunos = "";
        int numAlunos = 0;
        
        for(Disciplina objDisciplina : mackenzie.getDisciplinas())
        {
            listaDisciplina += objDisciplina.getCodigo() +  "\n";
        }
        
        
        codigoDisciplina = JOptionPane.showInputDialog("Digite o Código da Disciplina " + listaDisciplina);
        for(int i = 0; i < mackenzie.getEstudantes().size(); i++)
        {
            for(int j = 0; j < mackenzie.getEstudantes().get(i).getMatriculas().size(); j++)
            {
                if(mackenzie.getEstudantes().get(i).getDisciplinasMatriculadas().get(j).getCodigo().equals(codigoDisciplina))
                {
                    listaAlunos += mackenzie.getEstudantes().get(i).getId() + " | " + mackenzie.getEstudantes().get(i).getNome() + " | " + mackenzie.getEstudantes().get(i).getEmail() + "\n";
                    numAlunos++;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,listaAlunos + "\n Quantidade de alunos encontrados : " + numAlunos);
        
    }
}

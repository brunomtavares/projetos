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
    public static String constAluno = "";
    

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
                showAlunos();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                allDiciplinasEstudante();
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
            JOptionPane.showMessageDialog(null, "Valores não informados corretamente");
        }

        return resp;
    }

    public static void showAlunos() {
        for (Estudante estudante : mackenzie.getEstudantes()) {
            constAluno += ("Número: " + estudante.getId() + " Nome: " + estudante.getNome() + "\n");
        }
        JOptionPane.showMessageDialog(null, constAluno);
    }

    public static void allDiciplinasEstudante() {
        String constInfMatridoAluno = "";
        int credito = 0;
        //Exibe os alunos matriculados
        for (Estudante estudante : mackenzie.getEstudantes()) {
            constAluno += ("Número: " + estudante.getId() + " Nome: " + estudante.getNome() + "\n");
        }
        
        
        long matricula = infMatricula();
        
        
        //Percorre todos os estudantes
        for (Estudante estudantes : mackenzie.getEstudantes()) {
            //Seleciona apenas o que tiver a matricula informada
            if (estudantes.getId() == matricula) {
                //Como sabemos a posição em que ele se encontra iremos pegar o tamanho 
                //do array de diciplinas deste aluno e percorre-la
                for (Disciplina disciplinas : estudantes.getDisciplinasMatriculadas()) {
                    //A partir do array de diciplinas iremos pegar seu códio
                    constInfMatridoAluno += (disciplinas.getCodigo() + "\n");
                    //Somar os créditos de cada disciplina
                    credito += disciplinas.getCreditos();
                }
            }
        }

        exibeInfDisplina(constInfMatridoAluno, credito);
    }
    public static long infMatricula(){
        return Long.parseLong(JOptionPane.showInputDialog(null, constAluno + " Informe sua matrícula"));
    }
    public static void exibeInfDisplina(String constInfMatridoAluno,int credito){
        JOptionPane.showMessageDialog(null, constInfMatridoAluno + "\n Total de Crédito: " + credito);
    }
}

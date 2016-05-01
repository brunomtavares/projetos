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

    public static void main(String[] args) {
        Universidade mackenzie = new Universidade("Mackenzie");
        mackenzie.carregarDadosArquivo("disciplinas-abddcdccebbdcebdbadd", "estudantes-abddcdccebbdcebdbadd", "matriculas-abddcdccebbdcebdbadd");
        //Usuario irá informar sua escolha para o menu
        selection(choose());
    }

    //Menu com as opções 
    public static void selection(int choose) {
        switch (choose) {
            case 1:
                break;
            case 2:
                break;
            case 3:
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
    public static void getAlunos(){
        
    }
}

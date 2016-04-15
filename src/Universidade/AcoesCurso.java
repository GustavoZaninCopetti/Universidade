/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class AcoesCurso implements ActionListener{
    private IFCurso curso;

    public AcoesCurso(IFCurso curso){
        this.curso = curso;
    }
    @Override
    public void actionPerformed(ActionEvent ce) {
         if("salvarcurso".equals(ce.getActionCommand())){
         JOptionPane.showMessageDialog(null,"Codigo: " + curso.getInfoCurso().curso_codigo + "\n" +
                                            "Nome: " + curso.getInfoCurso().curso_nome + "\n "  + 
                                            "Localização: " + curso.getInfoCurso().curso_localizacao + "\n " + 
                                            "Quantidade Semestre: " + curso.getInfoCurso().curso_semestres + "\n " + 
                                            "Valor Curso: " + curso.getInfoCurso().curso_valor);
            
        }
         if("saircurso".equals(ce.getActionCommand())){
             curso.dispose();
         }
    }
}

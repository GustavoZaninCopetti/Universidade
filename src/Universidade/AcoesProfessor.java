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
public class AcoesProfessor implements ActionListener{
     private IFProfessor professor;
    
    public AcoesProfessor(IFProfessor professor){
        this.professor = professor;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent pe) {
        if("salvarprof".equals(pe.getActionCommand())){
         JOptionPane.showMessageDialog(null,"Codigo: " + professor.getInfoProfessor().prof_codigo + "\n" +
                                            "Nome: " + professor.getInfoProfessor().prof_nome + "\n "  + 
                                            "Cidade: " + professor.getInfoProfessor().prof_cidade + "\n " + 
                                            "Sexo: " + professor.getInfoProfessor().prof_sexo + "\n " + 
                                            "Estado: " + professor.getInfoProfessor().prof_estado+ "\n " + 
                                            "Materia: " + professor.getInfoProfessor().prof_materia);
            
        }
        if("sairprof".equals(pe.getActionCommand())){
            professor.dispose();
            
        }
        
    }
    
}

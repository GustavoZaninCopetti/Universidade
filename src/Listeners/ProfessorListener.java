/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import GetsSets.Professor;
import Views.ProfessorJIF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class ProfessorListener implements ActionListener{
     private ProfessorJIF professor;
    
    public ProfessorListener(ProfessorJIF professor){
        this.professor = professor;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent pe) {
        if("salvarprof".equals(pe.getActionCommand())){
            
            Professor p = professor.getInfoProfessor();
            
         JOptionPane.showMessageDialog(null,"Codigo: " + p.getProf_codigo() + "\n" +
                                            "Nome: " + p.getProf_nome() + "\n "  + 
                                            "Cidade: " + p.getProf_cidade() + "\n " + 
                                            "Sexo: " + p.isProf_sexo() + "\n " + 
                                            "Estado: " + p.getProf_estado()+ "\n " + 
                                            "Materia: " + p.getProf_materia());
            
        }
        if("sairprof".equals(pe.getActionCommand())){
            professor.dispose();
            
        }
         if("consultarprofessor".equals(pe.getActionCommand())){
             JOptionPane.showMessageDialog(null, "Consultar");         
                 
             
         }
    }
    
}

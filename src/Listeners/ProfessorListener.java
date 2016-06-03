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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            
        /* JOptionPane.showMessageDialog(null,"Codigo: " + p.getProf_codigo() + "\n" +
                                            "Nome: " + p.getProf_nome() + "\n "  + 
                                            "Cidade: " + p.getProf_cidade() + "\n " + 
                                            "Sexo: " + p.isProf_sexo() + "\n " + 
                                            "Estado: " + p.getProf_estado()+ "\n " + 
                                            "Materia: " + p.getProf_materia());*/
         
         
           try {
                FileWriter arq = new FileWriter("C:/Users/comp1/Desktop/Java/Universidade/LOG.txt",true);
                PrintWriter gravarArq = new PrintWriter(arq);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                gravarArq.printf("\n" + date + "\n");
                gravarArq.printf(p.getProf_codigo()  + "\n");
                gravarArq.printf(p.getProf_nome()  + "\n");
                gravarArq.printf(p.getProf_cidade()  + "\n");
                gravarArq.printf(p.isProf_sexo() + "\n");
                gravarArq.printf(p.getProf_estado() + "\n");
                gravarArq.printf(p.getProf_materia() + "\n");
                arq.close();
            } catch (IOException ec) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo");
            }
            
        }
        if("sairprof".equals(pe.getActionCommand())){
            professor.dispose();
            
        }
         if("consultarprofessor".equals(pe.getActionCommand())){
             JOptionPane.showMessageDialog(null, "Consultar");         
                 
             
         }
    }
    
}
